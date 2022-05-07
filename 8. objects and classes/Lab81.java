import java.util.Scanner;
 class Lab81{
  public static void main(String[] age){
      double r;
    Scanner s= new Scanner(System.in);
    System.out.print("your r is :- ");
    r=s.nextInt();
  Circle c = new Circle();
  c.area(r);
  c.perimeter(r);
  }
}

class Circle{
    void area(double r){
        System.out.println("your area is "+(3.14*r*r));
    }
    void perimeter(double r){
        System.out.println("your perimeter is "+(2*3.14*r));  
    }
}