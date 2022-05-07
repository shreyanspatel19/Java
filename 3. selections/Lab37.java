import java.util.Scanner;
 class Lab37{
    public static void main(String[] age){
        int a,b,c;
          System.out.println("enter the 3 side of triangle ");
         Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        if(a==b&&b==c&&a==c)
        {
            System.out.println("your triangle is Equilateral");
        }
        else if(a==b||b==c||a==c){
            System.out.println("your  Triangle is Isosceles Triangle");
        }
        else if (a!=b||b!=c||c!=b){
            System.out.println("your trianglke is Scalene Triangle");
        }
    }
}