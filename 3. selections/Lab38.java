import java.util.Scanner;
 class Lab38{
  public static void main(String[] age){
  int call;
  double bill;
  System.out.println("enter the telephone bille :- ");
  Scanner s = new Scanner(System.in);
  call=s.nextInt();

    if(call>200)
        bill=200+(0.60*50)+(0.50*50)+(0.40*(call-200));
    
    else if(call>150)
        bill=200+(0.60*50)+(0.50*(call-150));
    
    else if(call>100)
        bill=200+(0.60*(call-100));
    
    else
        bill=200;
    
    System.out.println("your bill is :- "+bill);

  }
}