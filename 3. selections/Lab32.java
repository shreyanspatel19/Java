import java.util.Scanner;
 class Lab32{
public static void main(String[] age){
char x;
System.out.println("enter the your letter");
Scanner s = new Scanner(System.in);
//x=s.nextchar();
x=s.next().charAt(0);

    if(x=='a'||x=='u'||x=='o'||x=='i'||x=='e'||x=='A'||x=='E'||x=='O'||x=='I'||x=='U')
    {
        System.out.println("this is vowel");
    }
    else{
        System.out.println("this letter is consonants");
    }

}
}