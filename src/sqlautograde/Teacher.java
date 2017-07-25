package sqlautograde;

public class Teacher extends Person{
    private String name;
    private String password;
    
    public Teacher(String name, String password) {
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
