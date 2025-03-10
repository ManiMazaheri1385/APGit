package packages;

import javax.swing.*;
import java.awt.*;

public class questionsPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBounds(0, 0, 600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 55, 30));
        panel.setBackground(new Color(0xFFEE8C));

        // Create font
        Font font = new Font("Arial", Font.BOLD, 17);

        // Question 1
        JLabel question1 = new JLabel("How attractive do you find the software’s user interface?");
        question1.setFont(font);
        question1.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel buttonPanel1 = new JPanel();
        buttonPanel1.setLayout(new BoxLayout(buttonPanel1, BoxLayout.X_AXIS));

        JRadioButton radio1_1 = new JRadioButton("1");
        radio1_1.setFont(font);
        JRadioButton radio1_2 = new JRadioButton("2");
        radio1_2.setFont(font);
        JRadioButton radio1_3 = new JRadioButton("3");
        radio1_3.setFont(font);
        JRadioButton radio1_4 = new JRadioButton("4");
        radio1_4.setFont(font);
        JRadioButton radio1_5 = new JRadioButton("5");
        radio1_5.setFont(font);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(radio1_1);
        group1.add(radio1_2);
        group1.add(radio1_3);
        group1.add(radio1_4);
        group1.add(radio1_5);

        buttonPanel1.add(radio1_1);
        buttonPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel1.add(radio1_2);
        buttonPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel1.add(radio1_3);
        buttonPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel1.add(radio1_4);
        buttonPanel1.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel1.add(radio1_5);

        // Question 2
        JLabel question2 = new JLabel("Is it easy for you to access the various features of the software?");
        question2.setFont(font);
        question2.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel buttonPanel2 = new JPanel();
        buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.X_AXIS));

        JRadioButton radio2_1 = new JRadioButton("1");
        radio2_1.setFont(font);
        JRadioButton radio2_2 = new JRadioButton("2");
        radio2_2.setFont(font);
        JRadioButton radio2_3 = new JRadioButton("3");
        radio2_3.setFont(font);
        JRadioButton radio2_4 = new JRadioButton("4");
        radio2_4.setFont(font);
        JRadioButton radio2_5 = new JRadioButton("5");
        radio2_5.setFont(font);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(radio2_1);
        group2.add(radio2_2);
        group2.add(radio2_3);
        group2.add(radio2_4);
        group2.add(radio2_5);

        buttonPanel2.add(radio2_1);
        buttonPanel2.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel2.add(radio2_2);
        buttonPanel2.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel2.add(radio2_3);
        buttonPanel2.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel2.add(radio2_4);
        buttonPanel2.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel2.add(radio2_5);

        // Question 3
        JLabel question3 = new JLabel("How simple and user-friendly is the software’s page design?");
        question3.setFont(font);
        question3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel buttonPanel3 = new JPanel();
        buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.X_AXIS));

        JRadioButton radio3_1 = new JRadioButton("1");
        radio3_1.setFont(font);
        JRadioButton radio3_2 = new JRadioButton("2");
        radio3_2.setFont(font);
        JRadioButton radio3_3 = new JRadioButton("3");
        radio3_3.setFont(font);
        JRadioButton radio3_4 = new JRadioButton("4");
        radio3_4.setFont(font);
        JRadioButton radio3_5 = new JRadioButton("5");
        radio3_5.setFont(font);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(radio3_1);
        group3.add(radio3_2);
        group3.add(radio3_3);
        group3.add(radio3_4);
        group3.add(radio3_5);

        buttonPanel3.add(radio3_1);
        buttonPanel3.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel3.add(radio3_2);
        buttonPanel3.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel3.add(radio3_3);
        buttonPanel3.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel3.add(radio3_4);
        buttonPanel3.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel3.add(radio3_5);

        // Question 4
        JLabel question4 = new JLabel("Are the colors and fonts used in the software appropriate?");
        question4.setFont(font);
        question4.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        JPanel buttonPanel4 = new JPanel();
        buttonPanel4.setLayout(new BoxLayout(buttonPanel4, BoxLayout.X_AXIS));

        JRadioButton radio4_1 = new JRadioButton("1");
        radio4_1.setFont(font);
        JRadioButton radio4_2 = new JRadioButton("2");
        radio4_2.setFont(font);
        JRadioButton radio4_3 = new JRadioButton("3");
        radio4_3.setFont(font);
        JRadioButton radio4_4 = new JRadioButton("4");
        radio4_4.setFont(font);
        JRadioButton radio4_5 = new JRadioButton("5");
        radio4_5.setFont(font);
      
        ButtonGroup group4 = new ButtonGroup();
        group4.add(radio4_1);
        group4.add(radio4_2);
        group4.add(radio4_3);
        group4.add(radio4_4);
        group4.add(radio4_5);

        buttonPanel4.add(radio4_1);
        buttonPanel4.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel4.add(radio4_2);
        buttonPanel4.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel4.add(radio4_3);
        buttonPanel4.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel4.add(radio4_4);
        buttonPanel4.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel4.add(radio4_5);

        // Next button to go to Page3
        JButton nextButton = new JButton("Next Page");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            thankYouPage thankYouPage = new thankYouPage();
            thankYouPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(question1);
        panel.add(Box.createRigidArea(new Dimension(6, 6)));
        panel.add(buttonPanel1);

        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        panel.add(question2);
        panel.add(Box.createRigidArea(new Dimension(6, 6)));
        panel.add(buttonPanel2);

        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        panel.add(question3);
        panel.add(Box.createRigidArea(new Dimension(6, 6)));
        panel.add(buttonPanel3);

        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        panel.add(question4);
        panel.add(Box.createRigidArea(new Dimension(6, 6)));
        panel.add(buttonPanel4);

        panel.add(Box.createRigidArea(new Dimension(10, 10)));

        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
