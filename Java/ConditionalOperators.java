import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int studentAnswer = sc.nextInt();
        int systemAnswer = sc.nextInt();
        if ((studentAnswer ==1 && systemAnswer == 1) || (studentAnswer !=1 && systemAnswer != 1) ){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

