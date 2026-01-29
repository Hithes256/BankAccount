public class Prime{
  public static void main(String[] args){
    int n=3;
    boolean flag=true;
    for(int i=2;i<n;i++){
      if(n%i==0){
        flag=false;
        break;
      }
    }
    if(flag){
      System.out.println("The number "+n+" is prime");
    }
    else{
      System.out.println("The number "+n+" is not prime");
    }
  }
}
