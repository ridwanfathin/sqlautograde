package sqlautograde;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {

    private String server = "jdbc:mysql://localhost:3306/autograde";
    private Statement statement = null;
    private Statement statementStudent = null;
    private Statement statementAnswer = null;
    private Statement statementActivity = null;
    private Connection connection = null;

    public void connect() {
        try {
            connection = DriverManager.getConnection(server, "root", "");
            statement = connection.createStatement();
            statementStudent = connection.createStatement();
            statementAnswer = connection.createStatement();
            statementActivity = connection.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("terjadi kesalahan saat koneksi");
        }
    }

    public void dc() {
        try {
            connection = DriverManager.getConnection(server, "root", "");
            connection.close();
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan");
        }
    }

    public void saveTeacher(Teacher p) {
        try {
            String query = "insert into teacher(name,password) values"
                    + "('" + p.getName() + "', "
                    + "'" + p.getPassword() 
                    + "')";
            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save teacher");
        }
    }

    public Boolean login(Teacher p) throws SQLException {
        try {
            String query = "select * from teacher where name='" + p.getName() + "' and password = '" + p.getPassword() + "'";
            ResultSet rs = statement.executeQuery(query);
            System.out.println(rs);
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat login");
        }
    }

    public Teacher getAccount(String name) {
        try {
            String query = "select * from teacher Where name ='" + name + "'";
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                Teacher p = new Teacher(rs.getString(2), rs.getString(1));
                return p;
            }
            return null;
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat load siswa");
        }
    }

    public void saveQuestion(Question q) {
        try {
            String query = "insert into questions(question_text,question_query,query_result) values"
                    + "('" + q.getQText() + "', "
                    + "'" + q.getQuery() + "', "
                    + "'" + q.getResult() 
                    + "')";
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                int generatedId = rs.getInt(1);
                q.setQId(generatedId);
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save soal");
        }
    }

    public void saveStudent(Student p) {
         try {
            String query = "insert into student(name,password) values"
                    + "('" + p.getName() + "', "
                    + "'" + p.getPassword() 
                    + "')";
            statement.execute(query);
        } catch (Exception e) {
            throw new IllegalArgumentException("terjadi kesalahan saat save teacher");
        }
    }
    
}
