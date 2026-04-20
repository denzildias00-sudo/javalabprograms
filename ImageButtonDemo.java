package lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo implements ActionListener {

    JFrame frame;
    JButton btnClock, btnHourGlass;
    JLabel label;

    public ImageButtonDemo() {

        // Create Frame
        frame = new JFrame("Image Button Demo");
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Load Images (make sure images exist in same folder or give full path)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Create Buttons with Images
        btnClock = new JButton("Digital Clock", clockIcon);
        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

        // Create Label
        label = new JLabel("Press a button");

        // Add Action Listeners
        btnClock.addActionListener(this);
        btnHourGlass.addActionListener(this);

        // Add components
        frame.add(btnClock);
        frame.add(btnHourGlass);
        frame.add(label);

        // Make visible
        frame.setVisible(true);
    }

    // Event Handling
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btnClock) {
            label.setText("Digital Clock is pressed");
        } else if (e.getSource() == btnHourGlass) {
            label.setText("Hour Glass is pressed");
        }
    }

    // Main Method
    public static void main(String[] args) {
        new ImageButtonDemo();
    }
}