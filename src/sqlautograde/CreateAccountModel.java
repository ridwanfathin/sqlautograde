package sqlautograde;

public class CreateAccountModel {
    Database d;

    public CreateAccountModel() {
        d = new Database();
        d.connect();
    }
    
    public void createAccount(String name, String password){
        Teacher p = new Teacher(name,password);
        d.saveTeacher(p);
    }
}
