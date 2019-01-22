import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Error extends JFrame {
    private JPanel contentPanel;
    private JTextField txtDodanoNowyP;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Error frame = new Error("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public Error(String error) {

        setBounds(100, 100, 420, 150);
        contentPanel = new JPanel();
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPanel);
        contentPanel.setLayout(null);

        txtDodanoNowyP = new JTextField();
        txtDodanoNowyP.setFont(new Font("Tahoma", Font.PLAIN, 16));
        txtDodanoNowyP.setText(error);
        txtDodanoNowyP.setBounds(0, 0, 400, 41);
        contentPanel.add(txtDodanoNowyP);
        txtDodanoNowyP.setColumns(10);

        JButton btnOk = new JButton("OK");
        btnOk.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                dispose();
            }
        });
        btnOk.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnOk.setBounds(48, 52, 144, 41);
        contentPanel.add(btnOk);
    }

}
