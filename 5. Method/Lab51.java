import java.util.Scanner;
 class Lab51
 {
    public static void main(String[] age)
    {

    // A	=	final amount
    // P	=	initial principal balance
    // r	=	annual interest rate
    // t	=	time (in years)

    double p,r,t,a;
    System.out.println("enter the initial principal balance\n annual interest rate\n time (in years) ");
    Scanner S = new Scanner(System.in);
    p=S.nextDouble();
    r=S.nextDouble();
    t=S.nextDouble();

    Lab51 ab=new Lab51();

    a=ab.simpleInterest(p,r,t);
    System.out.println("final amount is :- "+a);

    }

     double simpleInterest(double p,double r,double t){
        double a;
        a=p*r*t;
        // System.out.println("final amount is :- "+a);
       return a;
    }
}