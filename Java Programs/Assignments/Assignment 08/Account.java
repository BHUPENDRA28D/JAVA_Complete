class Account{
    private  int accountNO ;
    private  String accountHolderName;
    private double balance;
    private  static  double rateOfInterest;
// Setter Methods.
    public void setAccountNO(int acNo){
        this.accountNO  =acNo;

    }
    public void setAccountHolderName(String acName){
        this.accountHolderName =acName;

    }
    public void setBalance(double bal){
        this.balance=bal;
    }
    public static void setRateofInterest(double roi){
        Account.rateOfInterest = roi;
    }
    //Getter Methods
    public int getAccountNumber(){return accountNO;}    
    public String getAccountHolderName() { return accountHolderName;} 
    public double getBalance(){return balance;}
    
    public static double getRateOfIntrest(){ return Account.rateOfInterest;}
       


    public double simpleIntrest (int time){
       return balance * rateOfInterest*time/100;
    }
 
 public static void main(String[] args){
    Account a1 = new Account();
    Account a2 = new Account();
    a1.setAccountNO(34521);
    a1.setAccountHolderName("John Wick");
    a1.setBalance(1745093.8939);
    Account.setRateofInterest(8.5);
    System.out.println("Simple Intrest " + Account.getRateOfIntrest()+"%\n");
    //A2 
    a2.setAccountNO(8956);
    a2.setAccountHolderName("Steve Chutick");
    a2.setBalance(145592.0969);

    
    
    

    System.out.println("Details of Acooutn a1: "+"\n"
     +"Account Number : "+a1.getAccountNumber()+"\n"
     +"Account Holder Name   : "+a1.getAccountHolderName()+"\n"
     +"Current Balance      : $ "+a1.getBalance()+"\n");
    

    System.out.println("Details of Acooutn a2: "+"\n"
     +"Account Number : "+a2.getAccountNumber()+"\n"
     +"Account Holder Name   : "+a2.getAccountHolderName()+"\n"
     +"Current Balance      : $ " +a2.getBalance()+"\n" );
   

    
    System.out.println(
        "Simple Interest for a1 : "+a1.simpleIntrest(3)+"\n");
    
    System.out.println(
        "Simple Interest for a2 : "+a2.simpleIntrest(3)+"\n");

 }

}

