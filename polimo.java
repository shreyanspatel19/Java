import java.util.Scanner;

class gender{
    void male(){
        System.out.println("yes this is human ");
    }
}
class male extends gender{
    void male(){
        // super.male();
        System.out.println("yes this is male verizon ");
    }
}class fmale extends gender{
    void male(){
        super.male();
        System.out.println("yes this is fmale verizon ");
    }
}
 class polimo{
  public static void main(String[] age){
  gender g=new gender();
  g.male();
  male gg=new male();
  gg.male();
  fmale ggg=new fmale();
  ggg.male();
  gender gm= new male();
  System.out.println();
  gm.male();
  Scanner sc= new Scanner(System.in);
  int  n=sc.nextInt();
  }
}