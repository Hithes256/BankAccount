public class Bank{
  public static void main(String[] args){
    double balance=1000;
    double depositAmt=500;
    double withdrawAmt=300;

    System.out.println("Initial Balance: "+balance);

    balance+=depositAmt;
    System.out.println("Balance after Depositing "+depositAmt+" : "+balance);

    if(withdrawAmt > balance){
      System.out.println("Insufficient Balance! Can't withdraw");
    }
    else{
      balance-=withdrawAmt;
      System.out.println("Balance after withdrawing "+withdrawAmt+" : "+balance);
    }

    System.out.println("Final Balance: "+balance);
  }
}
