
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;

/**
 * Created by wenduoguo on 6/15/17.
 */
public class SellerHunter {
    private static final String AMAZONURL = "https://www.amazon.com";
    private static final String URLROOT1 = "https://www.amazon";
    private static final String URLROOT2 = "/gp/offer-listing/";
    private static final String PRODUCTPATH = "document/products.txt";
    private static final String BESTSELLERPATH = "document/bestSellers.txt";

    public static int getPositiveRating() {
        return positiveRating;
    }

    public static void setPositiveRating(int positiveRating) {
        SellerHunter.positiveRating = positiveRating;
    }

    public static int getTotalRating() {
        return totalRating;
    }

    public static void setTotalRating(int totalRating) {
        SellerHunter.totalRating = totalRating;
    }

    private static String countryFix = ".com";
    private static int positiveRating = 90;
    private static int totalRating = 100;

    public static void main(String[] args) {
        SellerHunter sh = new SellerHunter(countryFix, positiveRating, totalRating);
        sh.openPages();
    }



    public SellerHunter(String str, int pos, int rating) {
        positiveRating = pos;
        totalRating = rating;
        if (str.equals("US"))
            countryFix = ".com";

        if (str.equals("UK"))
            countryFix = ".co.uk";

        if (str.equals("CA"))
            countryFix = ".ca";
    }




    public static void openPages() {
        System.setProperty("webdriver.chrome.driver", "webdriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        File products = new File(PRODUCTPATH);
        FileOutput wf = new FileOutput();
        wf.setFile(BESTSELLERPATH);

        String data = "Best Sellers for the following products: \n";
        wf.setData(data);
        wf.write(false);

        try {
            FileReader fr = new FileReader(products);
            BufferedReader bf = new BufferedReader(fr);

            String productId;
            double productPrice = 0;
            double shippingPrice = 0;
            double totalPrice= 0;
            while ((productId = bf.readLine()) != null) {
                String bestSellerName = "";
                String bestSellerUrl = "";
                double price = 0;
                char dollarSign = '$';
                if (countryFix.equals(".uk"))
                    dollarSign = '£';



                String url = URLROOT1 + countryFix + URLROOT2 + productId;
                while (url != "") {
                    driver.get(url);

                    List<WebElement> allSellers = driver.findElements(By.className("olpOffer"));
                    for (WebElement seller : allSellers) {

                        int positiveNum = 0;
                        int ratingNum = 0;
                        if (seller.findElements(By.cssSelector(".olpSellerColumn#p")).size() > 0) {
                            String sellerString = seller.findElement(By.cssSelector(".olpSellerColumn#p")).getText();
                            int percentageIndex = sellerString.indexOf('%');
                            int ratingIndex1 = sellerString.indexOf('(');
                            int ratingIndex2 = sellerString.indexOf(" total ratings)");
                            positiveNum =  (percentageIndex != -1) ? Integer.parseInt(sellerString.substring(0, percentageIndex)) : 0;
                            ratingNum = (ratingIndex1 != -1 && ratingIndex2 != -1) ? Integer.parseInt(sellerString.substring(ratingIndex1 + 1, ratingIndex2).replaceAll(",", "")) : 0;
                        } else {
                            // Amazon
                            positiveNum = positiveRating + 10;
                            ratingNum = totalRating + 10;
                        }

                        // get price
                        String priceString = seller.findElement(By.className("olpOfferPrice")).getText();

                        int dollarIndex = priceString.indexOf(dollarSign);

                        productPrice = Double.parseDouble(priceString.substring(dollarIndex + 1).trim().replaceAll(",", ""));

                        // prime seller?
                        if (seller.findElements(By.cssSelector(".olpPriceColumn .supersaver")).size() > 0 && productPrice < 35) {
                            shippingPrice = 4.98;
                        } else if (seller.findElements(By.className("olpShippingPrice")).size() > 0) {
                            String priceString2 = seller.findElement(By.className("olpShippingPrice")).getText();
                            int dollarIndex2 = priceString2.indexOf(dollarSign);
                            shippingPrice = Double.parseDouble(priceString2.substring(dollarIndex2 + 1).trim().replaceAll(",", ""));
                        }
                        totalPrice = productPrice + shippingPrice;

                        // initialize price, best seller information
                        if (price == 0) {
                            price = totalPrice;

                            if (seller.findElements(By.cssSelector(".olpSellerName a")).size() > 0) {
                                WebElement sl = seller.findElement(By.cssSelector(".olpSellerName a"));
                                bestSellerName = sl.getText();
                                bestSellerUrl = sl.getAttribute("href");
                            } else {
                                bestSellerName = "Amazon";
                                bestSellerUrl = AMAZONURL;
                            }
                        }


                        if (positiveNum >= positiveRating && ratingNum >= totalRating && totalPrice < price) {
                            if (seller.findElements(By.cssSelector(".olpSellerName a")).size() > 0) {
                                WebElement sl = seller.findElement(By.cssSelector(".olpSellerName a"));
                                bestSellerName = sl.getText();
                                bestSellerUrl = sl.getAttribute("href");
                            } else {
                                bestSellerName = "Amazon";
                                bestSellerUrl = AMAZONURL;
                            }
                        }
                    }

                    // has next page?
                    if (driver.findElements(By.className("a-pagination")).size() > 0 &&
                            driver.findElement(By.cssSelector(".a-pagination .a-selected + li")).getAttribute("class").indexOf("a-last") == -1) {
                        url = driver.findElement(By.cssSelector(".a-pagination .a-selected + li a")).getAttribute("href");
                    } else {
                        url = "";
                    }
                }

                data = "\nProduct ID: " + productId + "\n" + countryFix+ "\n" + bestSellerName + ": " + dollarSign + totalPrice;
                wf.setData(data);
                wf.write(true);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            driver.close();
        }
    }
}
