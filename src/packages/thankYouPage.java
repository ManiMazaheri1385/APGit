package packages;

import javax.swing.*;
import java.awt.*;

public class thankYouPage {

    public void create(JFrame frame) {
        // Create and configure the panel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBounds(0, 0, 600, 600);
        panel.setBorder(BorderFactory.createEmptyBorder(220, 0, 300, 0));
        panel.setBackground(new Color(0xFFEE8C));

        // Create font
        Font font = new Font("Arial", Font.BOLD, 25);

        // Create thank you label
        JLabel thankYouLabel = new JLabel("Thank you for your participation!");
        thankYouLabel.setFont(font);
        thankYouLabel.setHorizontalAlignment(JLabel.CENTER);
        thankYouLabel.setVerticalAlignment(JLabel.CENTER);

        // Add components to the panel
        panel.add(thankYouLabel, BorderLayout.CENTER);

        // Add panel to the frame
        frame.add(panel);
    }
}
