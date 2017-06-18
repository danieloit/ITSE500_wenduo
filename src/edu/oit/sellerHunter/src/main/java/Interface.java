import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by wenduoguo on 6/15/17.
 */

public class Interface extends JFrame{
    private static String countryFix;
    private static int positiveRating;
    private static int totalRating;

    public static void main(String[] args) {

        Interface ui = new Interface();
    }
    public Interface() {
        //Frame
        final GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(grid);
        setTitle("Seller Hunter");
        GridBagLayout layout = new GridBagLayout();
        this.setLayout(layout);
        // Jlabel
        JLabel countryLabel = new JLabel("选择国家：");
        countryLabel.setSize(100, 40);
        JLabel positiveRatingLabel = new JLabel("最低好评率：");
        positiveRatingLabel.setSize(100, 40);
        JLabel ratingLabel = new JLabel("最少rating数：");
        ratingLabel.setSize(100, 40);

        // JComboBox etc
        String[] countryList = {"US", "UK", "CA"};
        final JComboBox countryComboBox = new JComboBox(countryList);
        countryComboBox.setSize(80, 40);
        final JSlider positiveRatingSlider = new JSlider(JSlider.HORIZONTAL, 80, 100, 90);
        positiveRatingSlider.setMinorTickSpacing(1);
        positiveRatingSlider.setMajorTickSpacing(5);
        positiveRatingSlider.setPaintTicks(true);
        positiveRatingSlider.setPaintLabels(true);

        positiveRatingSlider.setSize(80, 40);
        final JTextField ratingT = new JTextField("100");
        ratingT.setSize(80, 40);
        JButton submit = new JButton("Submit");
        submit.setSize(50, 40);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(countryLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(countryComboBox, gbc);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(positiveRatingLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(positiveRatingSlider, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 2;
        this.add(ratingLabel, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(ratingT, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(submit, gbc);


        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String country = countryComboBox.getSelectedItem().toString();



                positiveRating = positiveRatingSlider.getValue();


                int rating = Integer.parseInt(ratingT.getText());
                if (rating > 0)
                    totalRating = rating;

                SellerHunter sh = new SellerHunter(country, positiveRating, totalRating);
                sh.openPages();

            }
        });




        setSize(400, 400);
        setPreferredSize(getSize());
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}