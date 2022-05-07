import java.util.Scanner;
 class Lab31{
    public static void main(String[] age){
    int x;
    System.out.println("enter your number :- ");
    Scanner s = new Scanner(System.in);
    x=s.nextInt();
    if(x<0){
        System.out.println("this is negetive ");
    }
    else if (x>0)
    {
        System.out.println("this is positive");
    }
    else{
        System.out.println("this is zero");
    }
}
}