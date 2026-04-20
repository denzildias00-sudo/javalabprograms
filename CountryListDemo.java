package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class CountryListDemo {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country List Demo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Country List
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa",
            "Greenland", "Singapore"
        };

        // Create JList
        JList<String> list = new JList<>(countries);

        // Allow single selection
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add ScrollPane
        JScrollPane scrollPane = new JScrollPane(list);

        // Add List Selection Listener
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Avoid duplicate events
                if (!e.getValueIsAdjusting()) {
                    String selected = list.getSelectedValue();
                    System.out.println("Selected Country: " + selected);
                }
            }
        });

        // Add to frame
        frame.add(scrollPane);

        // Make visible
        frame.setVisible(true);
    }
}