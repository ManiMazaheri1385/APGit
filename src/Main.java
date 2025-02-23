import javax.swing.*;
import packages.informationPage;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // Create and configure the main frame
        JFrame frame = new JFrame("فرم نظرسنجی");
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        //Create font
        Font font = new Font("Arial", Font.BOLD, 25);

        // Create and configure the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(220, 240, 300, 240));
        panel.setBackground(new Color(0xFFEE8C));

        // Create title label
        JLabel title = new JLabel("فرم نظرسنجی");
        title.setFont(font);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);

        // Create start button
        JButton startButton = new JButton("شروع!");
        startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.setHorizontalAlignment(SwingConstants.CENTER);
        startButton.setVerticalAlignment(SwingConstants.CENTER);
        startButton.setPreferredSize(new Dimension(100, 50));
        startButton.setMinimumSize(new Dimension(100, 50));
        startButton.setMaximumSize(new Dimension(100, 50));

        // Add components to the panel
        panel.add(title, BorderLayout.NORTH);
        panel.add(startButton, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener to the start button
        startButton.addActionListener(e -> {
            // Remove the current panel
            frame.remove(panel);
            frame.revalidate();
            frame.repaint();

            // Load and display the first page
            informationPage informationPage = new informationPage();
            informationPage.create(frame);

            // Refresh the frame
            frame.revalidate();
            frame.repaint();
        });

        // Make the frame visible
        frame.setVisible(true);
    }
}
