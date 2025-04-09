import java.util.Scanner;

public class SyntaxBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = Math.abs(sc.nextInt()) % 1000;
        int b = Math.abs(sc.nextInt()) % 1000;
        double c=Math.sqrt(a*a+b*b);
        System.out.println(c);
    }
}