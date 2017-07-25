package sqlautograde;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.MainHandler;

public class LoginModel {
    Database db;
    
    public LoginModel() {
        db = new Database();
        db.connect();
    }
    
    public boolean login (String name, String password) throws SQLException{
        Teacher p = new Teacher(name, password);
        Database d = new Database();
        d.connect();
        System.out.println(name + " " +  password);
        if (db.login(p)) {
            p = d.getAccount(name);
            new MainHandler(p);
            return true;    
        } else {
            JOptionPane.showMessageDialog(null, "Login gagal", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
}
