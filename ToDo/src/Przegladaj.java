import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Przegladaj extends JFrame{
    private JPanel contentPane;
    private JTextField txtDodanoNowyP;
    private JTextField textField_id;
    private JTextField textField_nazwa;
    private JTextField textField_Kategoria;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Przegladaj frame = new Przegladaj();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Przegladaj() {
        setBounds(100, 100, 393, 233);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        final ToDoLista instance = ToDoLista.getInstance();

        String[] ar = new String[instance.size()];


        for (int i = 0; i < instance.size(); i++) {
            ar[i] = instance.czytajListe().get(i).getNazwa();
        }



        final JComboBox<String> comboBox = new JComboBox<String>(ar);
        comboBox.setBounds(37, 11, 275, 20);
        contentPane.add(comboBox);

        textField_id = new JTextField();
        textField_id.setEditable(false);
        textField_id.setBounds(126, 38, 186, 20);
        contentPane.add(textField_id);
        textField_id.setColumns(10);

        textField_nazwa = new JTextField();
        textField_nazwa.setEditable(false);
        textField_nazwa.setColumns(10);
        textField_nazwa.setBounds(126, 66, 186, 20);
        contentPane.add(textField_nazwa);

        JLabel lblId = new JLabel("ID");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblId.setBounds(47, 42, 46, 14);
        contentPane.add(lblId);

        JLabel lblNazwa = new JLabel("Nazwa");
        lblNazwa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNazwa.setBounds(47, 69, 100, 16);
        contentPane.add(lblNazwa);


        textField_id.setText(String.valueOf(instance.czytajListe().get(0).getID()));
        textField_nazwa.setText(instance.czytajListe().get(0).getNazwa());

        JLabel Kategoria = new JLabel("Kategoria");
        Kategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
        Kategoria.setBounds(47, 99, 100, 16);
        contentPane.add(Kategoria);

        textField_Kategoria = new JTextField();
        textField_Kategoria.setEditable(false);
        textField_Kategoria.setColumns(10);
        textField_Kategoria.setBounds(126, 99, 186, 20);
        contentPane.add(textField_Kategoria);


        int selectedIndex = comboBox.getSelectedIndex();

        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                int selectedIndex = combo.getSelectedIndex();

                textField_nazwa.setEditable(false);

                textField_id.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getID()));
                textField_nazwa.setText(instance.czytajListe().get(selectedIndex).getNazwa());
                textField_Kategoria.setText(instance.czytajListe().get(selectedIndex).getKategoria());






            }


        });

    }
}
