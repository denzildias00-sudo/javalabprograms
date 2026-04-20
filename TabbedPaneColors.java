package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class TabbedPaneColors {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Tabbed Pane - Colors");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create Panels
        JPanel cyanPanel = new JPanel();
        cyanPanel.setBackground(Color.CYAN);

        JPanel magentaPanel = new JPanel();
        magentaPanel.setBackground(Color.MAGENTA);

        JPanel yellowPanel = new JPanel();
        yellowPanel.setBackground(Color.YELLOW);

        // Add Tabs
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add ChangeListener for tab selection
        tabbedPane.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int index = tabbedPane.getSelectedIndex();
                String tabName = tabbedPane.getTitleAt(index);

                // Print to console
                System.out.println(tabName + " tab is selected");
            }
        });

        // Add to Frame
        frame.add(tabbedPane);

        // Make visible
        frame.setVisible(true);
    }
}