import java.util.Scanner;
 class Lab72{
  public static void main(String[] age){
  Bankaccount b = new Bankaccount();
  b.getBankaccountdetails();
  b.disaccountdetails();
  }
}
class Bankaccount{
    int account_no;
    String user_name;
    String account_type;
    double account_balance;
    Scanner s = new Scanner(System.in);

    void getBankaccountdetails(){
        System.out.print("enter account_no number     :-");
        account_no = s.nextInt();
        s.nextLine();

        System.out.print("enter user_name number      :-");
        user_name = s.nextLine();

        System.out.print("enter account_type number    :-");
        account_type = s.nextLine();

        System.out.print("enter account_balance number :-");
        account_balance = s.nextDouble();
    }
        void disaccountdetails(){
        System.out.println("enter account_no number      :-"+account_no);
        System.out.println("enter user_name number       :-"+user_name);
        System.out.println("enter account_type number    :-"+account_type);
        System.out.println("enter account_balance number :-"+account_balance);
    }
}