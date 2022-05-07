import java.util.Scanner;
 class Lab46{
  public static void main(String[] age){
  int n,even=0,odd=0;
  System.out.println("enter the number :- ");
  Scanner s=new Scanner(System.in);
  n=s.nextInt();
    for(;n!=0;){
        
        if(n%2==0){
            even=even+n;
        }
        if(n%2==1){
          odd=odd+n;  
        }
        if(n==0){
            break;
        }
        n=s.nextInt();
    }
    System.out.println("sum of the even number :- "+even);
    System.out.println("sum of the odd number :- "+odd);
  }
}