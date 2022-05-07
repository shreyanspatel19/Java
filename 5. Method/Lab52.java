import java.util.Scanner;
 class Lab52{
  public static void main(String[] age){
  double x,y,z;
  System.out.println("enter the two number : -");
 Scanner s = new Scanner(System.in);
 x=s.nextDouble();
 y=s.nextDouble();
 z=larg(x,y);
 System.out.println("ans is "+z);


  }
  public static double larg(double x, double y){
      if(x>y){
          return x;
      }
      else{
          return y;
      }
  }
}