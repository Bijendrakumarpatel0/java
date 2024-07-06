class Account {
    public String name;
    protected String email;
    private String Password;
    public String getPassword(String pass){
       return this.Password;
    }
    public void setPassword(String pass){
        this.Password=pass;
    }

}
public class Bank {
    public static void main(String [] args){
     Account account1=new Account();
     account1.name="Bijendra";
     account1.email="bijendrakumarpatel9@gmail.com";
     account1.setPassword("abcd");
     System.out.println(account1.getPassword());
    }
}