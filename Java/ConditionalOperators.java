import java.util.Scanner;
    public class ConditionalOperators {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int bishopRow = scanner.nextInt();   // строка слона
            int bishopCol = scanner.nextInt();   // столбец слона
            int targetRow = scanner.nextInt();   // строка фигуры
            int targetCol = scanner.nextInt();   // столбец фигуры

            if (Math.abs(bishopRow - targetRow) == Math.abs(bishopCol - targetCol)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }





