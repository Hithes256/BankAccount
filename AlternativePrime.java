public class AlternativePrime{
  public static void main(String[] args){
    int n=50,count=0;
    for(int num=2;num<=n;num++){
      boolean isPrime=true;
      for(int i=2;i<num;i++){
        if(num%i==0){
          isPrime=false;
          break;
        }
      }
      if(isPrime){
        count++;
        if(count%2==1){
          System.out.print(num+" ");
        }
      }
    }
  }
}
