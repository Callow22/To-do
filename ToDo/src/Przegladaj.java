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
    private JTextField textField_cena;
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

        textField_cena = new JTextField();
        textField_cena.setEditable(false);
        textField_cena.setColumns(10);
        textField_cena.setBounds(126, 96, 186, 20);
        contentPane.add(textField_cena);

        JLabel lblId = new JLabel("ID");
        lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblId.setBounds(47, 42, 46, 14);
        contentPane.add(lblId);

        JLabel lblNazwa = new JLabel("Nazwa");
        lblNazwa.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNazwa.setBounds(47, 69, 46, 14);
        contentPane.add(lblNazwa);

        JLabel lblCena = new JLabel("Cena");
        lblCena.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblCena.setBounds(47, 99, 46, 14);
        contentPane.add(lblCena);

 /*       JButton btnEdytuj = new JButton("Edytuj");
        btnEdytuj.setBounds(126, 161, 89, 23);
        contentPane.add(btnEdytuj);

        JButton btnZapisz = new JButton("Zapisz");
        btnZapisz.setBounds(223, 161, 89, 23);
        contentPane.add(btnZapisz);*/

        JButton btnUsun = new JButton("Usuń");
        btnUsun.setBounds(323, 161, 89, 23);
        contentPane.add(btnUsun);

        textField_id.setText(String.valueOf(instance.czytajListe().get(0).getID()));
        textField_cena.setText(String.valueOf(instance.czytajListe().get(0).getCena()));
        textField_nazwa.setText(instance.czytajListe().get(0).getNazwa());

        JLabel Kategoria = new JLabel("Kategoria");
        Kategoria.setFont(new Font("Tahoma", Font.BOLD, 14));
        Kategoria.setBounds(47, 124, 89, 14);
        contentPane.add(Kategoria);

        textField_Kategoria = new JTextField();
        textField_Kategoria.setEditable(false);
        textField_Kategoria.setColumns(10);
        textField_Kategoria.setBounds(126, 123, 186, 20);
        contentPane.add(textField_Kategoria);


        int selectedIndex = comboBox.getSelectedIndex();

        comboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                int selectedIndex = combo.getSelectedIndex();

                textField_cena.setEditable(false);
                textField_nazwa.setEditable(false);

                textField_id.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getID()));
                textField_cena.setText(String.valueOf(instance.czytajListe().get(selectedIndex).getCena()));
                textField_nazwa.setText(instance.czytajListe().get(selectedIndex).getNazwa());
                textField_Kategoria.setText(instance.czytajListe().get(selectedIndex).getKategoria());






            }


        });


/*        btnEdytuj.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                textField_cena.setEditable(true);
                textField_nazwa.setEditable(true);


            }
        });


        btnZapisz.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                String nazwa = textField_nazwa.getText();
                double cena = Double.parseDouble(textField_cena.getText());

                instance.czytajListe().get(comboBox.getSelectedIndex()).edytuj(nazwa, cena);


                textField_cena.setEditable(false);
                textField_nazwa.setEditable(false);


            }
        });*/
        btnUsun.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {

                String nazwa = textField_nazwa.getText();
                double cena = Double.parseDouble(textField_cena.getText());

                instance.usunZListy(instance.czytajListe().get(comboBox.getSelectedIndex()).getID());


            }
        });


    }
}
