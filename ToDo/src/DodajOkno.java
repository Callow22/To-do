import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DodajOkno extends JFrame {
    private JPanel DodajPanel;
    private JTextField textField_id;
    private JTextField textField_nazwa;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    DodajOkno frame = new DodajOkno();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public DodajOkno() {
        setBounds(100, 100, 500, 379);
        DodajPanel = new JPanel();
        DodajPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(DodajPanel);
        DodajPanel.setLayout(null);
        JLabel lblIdZadania = new JLabel("ID:");
        lblIdZadania.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblIdZadania.setBounds(51, 25, 125, 27);
        DodajPanel.add(lblIdZadania);

        JLabel lblNazwaZadania = new JLabel("Nazwa:");
        lblNazwaZadania.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNazwaZadania.setBounds(51, 58, 125, 27);
        DodajPanel.add(lblNazwaZadania);

        textField_id = new JTextField();
        textField_id.setBounds(176, 30, 177, 22);
        textField_id.setEditable(false);
        DodajPanel.add(textField_id);
        textField_id.setColumns(10);

        textField_nazwa = new JTextField();
        textField_nazwa.setColumns(10);
        textField_nazwa.setBounds(176, 63, 177, 22);
        DodajPanel.add(textField_nazwa);

        JButton btnDodaj = new JButton("Dodaj");
        btnDodaj.setBounds(176, 128, 177, 23);
        DodajPanel.add(btnDodaj);

        final ToDoLista instance = ToDoLista.getInstance();
        if(instance.czytajListe().size() > 0) {
            textField_id.setText(String.valueOf(instance.czytajListe().size()));
        }
        else {
            textField_id.setText(String.valueOf(0));
        }

        final String kategorie[] = {"Praca", "Dom", "Studia", "Inne"};

        final JComboBox<String> comboBox = new JComboBox<String>(kategorie);
        comboBox.setBounds(176, 95, 177, 20);
        DodajPanel.add(comboBox);
        int selectedIndex = comboBox.getSelectedIndex();


        JLabel lblKategoria = new JLabel("Kategoria:");
        lblKategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblKategoria.setBounds(51, 95, 115, 27);
        DodajPanel.add(lblKategoria);

        btnDodaj.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {


                String nazwa = textField_nazwa.getText();
                if(nazwa.isBlank()) {
                   // System.out.println("Failed");
                    Error frame3= new Error("Nieprawidłowa nazwa zadania");
                    frame3.setVisible(true);
                    return;
                }

                String kategoria = kategorie[comboBox.getSelectedIndex()];
                ZadanieInterface zadania= new Zadanie(nazwa, kategoria);
                instance.dodajDoListy(zadania);
                textField_id.setText(String.valueOf(zadania.getID()));
                textField_nazwa.setText("");
                Error frame1 = new Error("Dodano nowe zadanie!");
                frame1.setVisible(true);

            }

        });


    }

}
