import java.util.Scanner;
 class Lab55{
  public static void main(String[] age){
  double r,b,h;
    int ss,n;
    Scanner s = new Scanner(System.in);
    System.out.println("enter the choise number \n1-circle area\n2-triangle\n3-square");
    n=s.nextInt();

      switch(n){
        case  1 :
            System.out.println("enter the circle radius :- ");
            r=s.nextDouble();
            area(r);
            break;
        
        case  2 :
            System.out.println("enter the triangle base and height :- ");
            b=s.nextDouble();
            h=s.nextDouble();
            area(b,h);
            break;

        case 3 :
            System.out.println("enter the square  side :- ");
            ss=s.nextInt();
            area(ss);
            break;

        default:
            System.out.println("INVALID NUMBER");
        
      }



  }
  public static void area(double r){
      double area=3.14*r*r;
      System.out.println("your circle area is :- "+area);
  } 
   public static void area(double b,double h){
       double  area = (b*h)/2;
       System.out.println("your triangle area is :- "+area); 
  }
    public static void area(int ss){
      int area = ss*ss;
      System.out.println("your square area is :- "+area);   
  }
}