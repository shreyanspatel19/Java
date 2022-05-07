import java.util.Scanner;
 class Lab44{
  public static void main(String[] age){
      double n,ans=1;
      System.out.println("enter the number :- ");
      Scanner s=new Scanner(System.in);
      n=s.nextInt();
      for(int i=1;i<=n;i++){
          ans=1.0/i+ans;
      }
      System.out.println("your ans is "+ans);
  }
}