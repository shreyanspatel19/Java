import java.util.Scanner;
 class Lab56{
  public static void main(String[] age){
  int n1,n2;
  System.out.println("enter the two number :- ");
  Scanner s= new Scanner(System.in);
  n1=s.nextInt();
  n2=s.nextInt();
  gcdnumber g = new gcdnumber();
    g.gcd1(n1,n2);
    g.gcd2(n1,n2);
  }
}

class gcdnumber{
    public static void gcd1(int n1, int n2){
        int larg=1;
       for(int i=1;i<n1;i++){
           if(n1%i==0){
             for(int j=1;j<n2;j++){
                 if(n2%j==0){
                     if(i==j){
                         larg=j;
                        }
                 }
             }
           }
       }
       System.out.println("larg is  1 "+larg);
    }
    public static void gcd2(int n1,int n2){
    int max,larg=1;
        max=n1;
        if(n2<n1){
            max=n2;
        }
    for( int i=1;i<max;i++)
        if(n1%i==0&&n2%i==0){
            larg=i;
        }

       System.out.println("larg is 2 "+larg);
    }
}

