import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class HalloweenVirtualHouseGUI extends JFrame implements ActionListener {

    private JPanel buttonPanel = new JPanel();
    private LivingRoomBasicPanel graphicalPanel = new LivingRoomBasicPanel();
    private JButton btnChangeCelebrationMode = new JButton("Change Celebration Mode");
    private JButton btnChangeScaryMode = new JButton("Change Scary Mode");

    public HalloweenVirtualHouseGUI(String mode) throws IOException {
        setTitle("Happy Halloween");
        add(graphicalPanel, BorderLayout.NORTH);
        buttonPanel.setBackground(Color.white);
        buttonPanel.add(btnChangeCelebrationMode);
        buttonPanel.add(btnChangeScaryMode);
        btnChangeCelebrationMode.addActionListener(this);
        btnChangeScaryMode.addActionListener(this);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
        setSize(1400, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent event) {

        if (event.getSource() == btnChangeCelebrationMode) {
            graphicalPanel.setMode("celebration");
            this.repaint();
        } else if (event.getSource() == btnChangeScaryMode) {
            graphicalPanel.setMode("scary");
            this.repaint();
        }
    }



}

