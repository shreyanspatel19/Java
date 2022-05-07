import java.util.Scanner;
 class Lab65{
  public static void main(String[] age){
     int n;
     System.out.print("enter the length of arrys :- ");
     Scanner s = new Scanner(System.in);
     n=s.nextInt();
     int arry[][]=new int[n][n];

     for(int i=0;i<arry.length;i++){
       for(int j=0;j<arry.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry[i][j]=s.nextInt();
      }
     }

     for(int i=0;i<arry.length;i++){
       for(int j=0;j<arry.length;j++){

         System.out.print(" " +arry[i][j]+"  ");

       }
       System.out.println();
     }
  }
}