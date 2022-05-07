import java.util.Scanner;
 class Lab36{
    public static void main(String[] age){
        int a,b,ans;
        System.out.println("enter your number ;- ");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        char choise;
        choise=s.next().charAt(0);

        switch(choise){
            case '+':
              ans=a+b;
                System.out.println("calcul ans is "+ans);
                break;
             case '-':
                ans=a-b;
                System.out.println("calcul ans is "+ans);
                break;
             case '*':
              ans=a*b;
                System.out.println("calcul ans is "+ans);
                break;
            case '/':
                ans=a/b;
                System.out.println("calcul ans is "+ans);
                break;
        }

    }
}