import java.util.Scanner;
 class addmatrix{
  public static void main(String[] age){
     int n;
     System.out.print("enter the length of arrys :- ");
     Scanner s = new Scanner(System.in);
     n=s.nextInt();
     int arry1[][]=new int[n][n];
     int arry2[][]=new int[n][n];
     int ans[][]=new int[n][n];

    System.out.println("enter first  arry1 :- ");

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry1[i][j]=s.nextInt();
      }
     }
    System.out.println("enter second  arry2 :- ");
    
     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry2[i][j]=s.nextInt();
      }
     }

     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){
       
           ans[i][j]=arry1[i][j]+arry2[i][j] ;
    
      }
     }
     
     for(int i=0;i<arry1.length;i++){
       for(int j=0;j<arry1.length;j++){

         System.out.print(" " +ans[i][j]+"  ");

       }
       System.out.println();
     }
  }
}