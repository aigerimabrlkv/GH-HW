import java.util.Scanner;
    public class ConditionalOperators {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int queenRow = scanner.nextInt();     // строка ферзя
            int queenCol = scanner.nextInt();     // столбец ферзя
            int targetRow = scanner.nextInt();    // строка фигуры
            int targetCol = scanner.nextInt();    // столбец фигуры

            boolean sameRow = queenRow == targetRow;
            boolean sameCol = queenCol == targetCol;
            boolean sameDiagonal = Math.abs(queenRow - targetRow) == Math.abs(queenCol - targetCol);

            if (sameRow || sameCol || sameDiagonal) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }





