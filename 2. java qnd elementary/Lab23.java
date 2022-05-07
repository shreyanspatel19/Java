import java.util.Scanner;
public class Lab23{
public static void main(String[] age){
System.out.println("enter the temperature in fahrenheit :- ");
double f,c=5;
Scanner s=new Scanner(System.in);
f=s.nextDouble();
System.out.println("felsius is :- "+f);
c=(f-32)*0.5556;
System.out.println("celsius is :- "+c);
}
}