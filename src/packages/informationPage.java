package packages;

import javax.swing.*;
import java.awt.*;

public class informationPage {

    public void create(JFrame frame) {
        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBounds(0, 0, 600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 55, 30));
        panel.setBackground(new Color(0xFFEE8C));

        //Create font
        Font font = new Font("Arial", Font.BOLD, 20);
        Font fieldFont = new Font("Arial", Font.PLAIN, 17);

        // Name Label and Text Field
        JLabel nameLabel = new JLabel("اسم");
        nameLabel.setFont(font);
        JTextField nameField = new JTextField(15);
        nameField.setFont(fieldFont);
        nameLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        nameField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        // Age Label and Text Field
        JLabel ageLabel = new JLabel("سن");
        ageLabel.setFont(font);
        JTextField ageField = new JTextField(15);
        ageField.setFont(fieldFont);
        ageLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        ageField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        // Email Label and Text Field
        JLabel emailLabel = new JLabel("ایمیل");
        emailLabel.setFont(font);
        JTextField emailField = new JTextField(15);
        emailField.setFont(fieldFont);
        emailLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        emailField.setAlignmentX(JTextField.CENTER_ALIGNMENT);

        // Software Familiarity Level
        JLabel levelLabel = new JLabel("سطح آشنایی با نرم افزارهای مشابه");
        levelLabel.setFont(font);
        levelLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        // Create the button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        // Radio Buttons
        JRadioButton level1 = new JRadioButton("مبتدی");
        level1.setFont(font);
        JRadioButton level2 = new JRadioButton("متوسط");
        level2.setFont(font);
        JRadioButton level3 = new JRadioButton("پیشرفته");
        level3.setFont(font);
        JRadioButton level4 = new JRadioButton("بدون آشنایی");
        level4.setFont(font);

        // Group the radio buttons
        ButtonGroup group = new ButtonGroup();
        group.add(level1);
        group.add(level2);
        group.add(level3);
        group.add(level4);

        // Add buttons to the button panel
        buttonPanel.add(level1);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel.add(level2);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel.add(level3);
        buttonPanel.add(Box.createRigidArea(new Dimension(5, 5)));
        buttonPanel.add(level4);

        // Next Page Button
        JButton nextButton = new JButton("صفحه بعد");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            // Remove current panel and move to Page2
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            questionsPage questionsPage = new questionsPage();
            questionsPage.create(frame);

            frame.revalidate();
            frame.repaint();
        });

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(nameField);
        panel.add(Box.createRigidArea(new Dimension(15, 15)));
        panel.add(ageLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(ageField);
        panel.add(Box.createRigidArea(new Dimension(15, 15)));
        panel.add(emailLabel);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(emailField);
        panel.add(Box.createRigidArea(new Dimension(15, 15)));
        panel.add(levelLabel);
        panel.add(Box.createRigidArea(new Dimension(6, 6)));
        panel.add(buttonPanel);
        panel.add(Box.createRigidArea(new Dimension(10, 10)));
        panel.add(nextButton);

        // Add panel to the frame
        frame.add(panel);
    }
}
