import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static sun.plugin.javascript.navig.JSType.URL;

/**
 * Created by wenduoguo on 6/17/17.
 */
public class TaobaoCrawler {

    public static final String URL_ROOT = "https://hqhyyd.world.tmall.com/search.htm?spm=a312a.7700824.w4011-10009610449.326.2ZIRRw&search=y&pageNo=";
    public static final String URL_PRODUCT = "https://world.tmall.com/item/20183080276.htm?spm=a312a.7700824.w4011-10009610449.90.YwBLzI&id=";

    public static void main(String[] args) throws IOException {
        int productCount = 0;
        for (int i = 1; i < 7; i++) {
            Document doc = null;
            String url = URL_ROOT + i + "&tsearch=y#anchor";
            doc = Jsoup.connect(url).get();


            Elements items = doc.select("dl");
            for (Element item : items){
                Element detail = item.select("dd").get(0);


                String price = detail.select("span c-price").text();

                String title = detail.select("a").text();
                String id = item.attr("data-id");
                String imageUrl = item.select("dt img").attr("src");


                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




                Document productPage = null;
                try {
                    productPage = Jsoup.connect(URL_PRODUCT + id).get();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Element brandLine = productPage.select(".attributes-list > li[J_attrBrandName]").first();
                String brand = brandLine.text();



                Product product = new Product();
                product.setTitle(title);
                product.setId(id);
                product.setBrand(brand);
                product.setPrice(price);
                product.setImage(imageUrl);

                productCount++;

                String data = product.toString();
                WriteFile wf = new WriteFile();
                wf.setFile("document/taobao.txt");
                wf.setData(data);
                wf.run();

            }
        }



    }



}
