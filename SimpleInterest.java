public class SimpleInterest{
  public static void main(String[] args){
    int principal=1000;
    int rate=5;
    int time=2;
    int SI=(principal * rate * time)/100;
    System.out.println("Simple interest is "+SI);
    int totalAmt=principal + SI;
    System.out.println("Total Amount is "+totalAmt);
  }
}
