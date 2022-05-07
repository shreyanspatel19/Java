import java.util.Scanner;
 class Lab45{
  public static void main(String[] age){
      int n,reverse=0,r;
      System.out.println("enter the number :- ");
      Scanner s =new Scanner(System.in);
      n=s.nextInt();
      for(;n!=0;){
          r=n%10;
         reverse=r+reverse*10;
         n=n/10;
      }
      System.out.println("your reverse number is :- "+reverse);
  }
}