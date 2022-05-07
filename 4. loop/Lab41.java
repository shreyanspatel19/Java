import java.util.Scanner;
 class Lab41{
    public static void main(String[] age){
    int a,b;
    System.out.println("enter two number :- ");
    Scanner s =new Scanner(System.in);
    a=s.nextInt();
    b=s.nextInt();

    for(int i=a;i<=b;i++){
            if(i%2==0){
                if(i%3!=0)
                System.out.println("i="+i);
            }
    }

    }
}