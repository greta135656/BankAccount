public class BankAccount {
    
    // Instance Variables
    private double balance;
    private int accountID;
    private String password;
    
    //constructor
    public BankAccount( int a, String p){
      //initialize
      password = p;
      accountID = a ;
      balance = 0;
    }
    
    // method 1
    public double getBalance() {
      return balance;
    }
    
    // method 2
    public int getAccountID() {
      return accountID;
    }

    // set method for password 
    public void setPassword(String password1){
    password = password1;
    }

    // deposit money
    public boolean deposit(double amount)
    {  if (amount >= 0)
       {balance = balance + amount;
       return true;}
       
       {return false;}}
       
    

    // withdraw
    public boolean withdraw(double amount){
     if (amount > balance || amount < 0)
    {return false;}
    {balance = balance - amount;
    return true;}
    }

    // shows account ID and Balance

    public String toString() {
      return (accountID + "\t" + balance);
  }
}
