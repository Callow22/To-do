
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class GUI {

    public JFrame frmZarzadzanieZadaniami;



    public GUI() {
        initialize();
    }

    private void initialize() {
        frmZarzadzanieZadaniami = new JFrame();
        frmZarzadzanieZadaniami.setTitle("Zarządzanie Zadniami");
        frmZarzadzanieZadaniami.setBounds(100, 100, 583, 300);
        frmZarzadzanieZadaniami.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmZarzadzanieZadaniami.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));


        JButton btnNewButton = new JButton("Dodaj");
        btnNewButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                DodajOkno frame1 = new DodajOkno();
                frame1.setVisible(true);
            }
        });
        btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
        frmZarzadzanieZadaniami.getContentPane().add(btnNewButton);


        JButton btnPrzegldaj = new JButton("Wyświetl");
        btnPrzegldaj.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                Przegladaj frame1 = new Przegladaj();
                frame1.setVisible(true);
            }
        });
        frmZarzadzanieZadaniami.getContentPane().add(btnPrzegldaj);

        JButton btnUsun = new JButton("Usuń");
        btnUsun.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent arg0) {
                UsunOkno frame1 = new UsunOkno();
                frame1.setVisible(true);
            }
        });
        frmZarzadzanieZadaniami.getContentPane().add(btnUsun);

        JButton btnWyjdz= new JButton("Wyjdź");
        btnWyjdz.addMouseListener(new MouseAdapter() {
            @Override
                    public void mousePressed(MouseEvent arg0){
            System.exit(0);}
        });
        frmZarzadzanieZadaniami.getContentPane().add(btnWyjdz);


    }



}
