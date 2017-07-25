package sqlautograde;

public class Student extends Person{
    private String name;
    private String password;
    
    public Student(String name, String password) {
        super(name);
        this.password = password;
    }

    public String getName() {
        return super.getName();
    }

    public void setName(String name) {
        super.setName(name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
