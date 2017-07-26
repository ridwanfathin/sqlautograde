package sqlautograde;

import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import view.MainHandler;

public class MainModel {

    Database db;
    Teacher teacherLogin;

    ArrayList<Activity> listActivity = new ArrayList<>();

    public MainModel(Teacher p) {
        db = new Database();
        db.connect();
        teacherLogin = p;
    }
    
    public void tambahSoal(int kode, String soal, String query) {
        db.connect();
        Question q = new Question(kode, soal, query);
        db.saveQuestion(q);
    }
    
    public void outputQuery (String query) throws SQLException{
        Database d = new Database();
        d.connect();
        String res = db.getOQuery(query);
        System.out.println(res);
    }

}
