package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;
import sqlautograde.MainModel;
import sqlautograde.Teacher;

public class MainHandler implements ActionListener {

    private MainModel model;
    private Main view;
    private Statement statement = null;

    public MainHandler(Teacher p) {
        model = new MainModel(p);
        view = new Main();
        view.setVisible(true);
        view.addActionListener(this);
        view.setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        try {
             if (source.equals(view.getBtnTambah())) {
                if (view.getKode().equals("") && view.getSoal().equals("") && view.getQuery().equals("")) {
                    JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong", "Input Kosong", 0);
                } else {
                    model.tambahSoal(Integer.parseInt(view.getKode()), view.getSoal(), view.getQuery());
                }
            }else if (source.equals(view.getBtnQuery()))  {
                try {
                    String query = view.getQuery();
                    System.out.println(query);
                    model.outputQuery(query);
                } catch (Exception e) {
                    throw new IllegalArgumentException("terjadi kesalahan saat mengeksekusi query");
                }
             } 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, e.getMessage());
        }
    }
}
