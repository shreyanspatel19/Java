import java.util.Scanner;
 class Lab82{
  public static void main(String[] age){
  time t=new time();
  t.scan();
  t.add();
  }
}
class time{
    int t1,t2,m1,m2;
    int addm,addt;
    Scanner s=new Scanner(System.in);
    void scan(){
        System.out.println("enter first time :- ");
        t1=s.nextInt();
        m1=s.nextInt();
        System.out.println("enter second time :- ");
        t2=s.nextInt();
        m2=s.nextInt();
    }
    void add(){
        addm=m1+m2;
        addt=t1+t2;
        if(addm>60){
            System.out.print(" addition is = "+(addt+1));
            System.out.print(" "+(addm=addm-60));
        }
        else{
            System.out.print(" addition is = "+addt);  
            System.out.print(" "+addm);           
        }
    }
}