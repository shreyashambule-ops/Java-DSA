package bank;

class Account{
    public String name;
    private String password;

    //getters
    public String getPassword() {
        return password;
    }

    //setters
    public void setPassword(String password) {
        this.password = password;
    }
}
public class Bank {
    public static void main(String[] args) {
       Account acc1= new Account();
       acc1.name="Shreyash"; 
       acc1.setPassword("shsh");
       System.out.println(acc1.getPassword());
    }
}