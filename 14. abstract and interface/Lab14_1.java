import java.util.Scanner;

abstract class vegetable{
    String colour;

    vegetable(String s){
        colour=s;
        // System.out.println(" abstract display ");

    }
     public abstract void display();
}

 class potato extends vegetable{
    potato(String colour){

        super("brown");
    }
     public  void display(){
         System.out.println("poteto ------------- displau");
     }

    // vegetable.display();
    public  String toString(){

        return "potato ,"+colour;
    }
}
 class brinjal extends vegetable{
    brinjal(String colour){
        super("dark blue");
    }
        public String toString(){
        return "brijal ,"+colour;

    }
         public  void display(){
         System.out.println("poteto--------------- displau");
     }
}
 class tomato extends vegetable{
    tomato(String colour){
        super("red");
    }
        public String toString(){
                return "tomato ,"+colour;

    }
         public  void display(){
         System.out.println("poteto ----------------displau");
     }
}

 class Lab14_1{
  public static void main(String[] age){
      String colou="ok";
      potato p=new potato(colou);
     System.out.println(p);
      brinjal b=new brinjal(colou);
           System.out.println(b);

      tomato t=new tomato(colou);
           System.out.println(t);

  }
}