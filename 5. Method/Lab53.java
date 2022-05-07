import java.util.Scanner;
class Lab53{
    public static void main(String[] args){
        int n;
        System.out.print("enter the number : - ");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        fibonaci(n);
    }
    public static int fibonaci(int n){
        int n1=0,n2=1;
        int n3,sum=0;
        if(n==0){
            System.out.println("n = 0");
        }
        else if(n==1){
            System.out.println("n = 1");
        }
        else{
        for(int i=2;i<=n;i++){
             n3=n1+n2;
             n1=n2;
             n2=n3;
            sum+=n3;
        }
        // System.out.println("n = "+n3);
        sum=sum+1;System.out.println("sum is  "+sum);
        }
        return 0;
    }
}