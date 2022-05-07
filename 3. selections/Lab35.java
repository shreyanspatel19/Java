import java.util.Scanner;
 class Lab35{
    public static void main(String[] age){
        int x,y,z,larg;
        System.out.println("enter the 3 number ");
         Scanner s = new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        larg=(x>y)?((x>z)?x:z):((y>z)?y:z);
        System.out.println("larg numbr is  "+larg);
    }
}