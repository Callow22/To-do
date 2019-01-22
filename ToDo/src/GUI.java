
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JFrame;
import javax.swing.JButton;

import javax.swing.SwingConstants;



import java.awt.FlowLayout;


public class GUI {

    public JFrame frmZarzadzanieZakupami;



    public GUI() {
        initialize();
    }

    private void initialize() {
        frmZarzadzanieZakupami = new JFrame();
        frmZarzadzanieZakupami.setTitle("Zarz\u0105dzanie Zakupami");
        frmZarzadzanieZakupami.setBounds(100, 100, 583, 300);
        frmZarzadzanieZakupami.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmZarzadzanieZakupami.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));


        JButton btnNewButton = new JButton("Dodaj Produkt");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                DodajOkno frame1 = new DodajOkno();
                frame1.setVisible(true);
            }
        });
        btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
        frmZarzadzanieZakupami.getContentPane().add(btnNewButton);


        JButton btnPrzegldaj = new JButton("Przegl\u0105daj Zakupy");
        btnPrzegldaj.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                Przegladaj frame1 = new Przegladaj();
                frame1.setVisible(true);
            }
        });
        frmZarzadzanieZakupami.getContentPane().add(btnPrzegldaj);

        JButton btnStatystyki = new JButton("Statystyki");
        frmZarzadzanieZakupami.getContentPane().add(btnStatystyki);
    }



}
