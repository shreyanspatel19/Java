import java.util.Scanner;
 class Lab68{
  public static void main(String[] age){
     Scanner s = new Scanner(System.in);
     int arry[][]=new int[4][4];
     int rowsum=0;
     int col[]=new int[4];

     for(int i=0;i<arry.length;i++){
       for(int j=0;j<arry.length;j++){
         System.out.print( i+"  " +j+ ":- " );
       arry[i][j]=s.nextInt();
      }
     }

     System.out.println();

     for(int i=0;i<arry.length;i++){
       for(int j=0;j<arry.length;j++){

         System.out.print(" " +arry[i][j]+"  ");
         rowsum=rowsum+arry[i][j];
        col[i]+=arry[j][i];
       }
       System.out.println("    = "+rowsum);
       rowsum=0;
       System.out.println();
     }
     for(int i=0;i<2;i++){
       for(int j=0;j<=col.length-1;j++){
           if(i==0){
             System.out.print(" -  ");
           }
           else{
              System.out.print(" "+col[j]+"  ");
           } 
      }
      System.out.println(" ");
     }
     System.out.println();
  }
}