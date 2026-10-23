import java.util.Scanner;
public class NumberPatternGenerator {
    public static void rightTriangle(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedRightTriangle(int row) {
        for (int i = row; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = i; j <= row; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedPyramid(int row) {
        for (int i = row; i > 0; i--) {
            int k = row - i;
            while (k > 0) {
                System.out.print(" ");
                k--;
            }
            for (int j = 0; j < (i * 2 -1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            if (rows < 0) {
                System.out.println("Enter a number greater than 0.");
                continue;
            }
            System.out.println("Choose the pattern type:");
            System.out.println("1 - Right Triangle");
            System.out.println("2 - Inverted Right Triangle");
            System.out.println("3 - Pyramid");
            System.out.println("4 - Inverted Pyramid");
            System.out.println("5 - Exit");
            System.out.print("Your choice: ");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    rightTriangle(rows);
                    break;
                case 2:
                    invertedRightTriangle(rows);
                    break;
                case 3:
                    pyramid(rows);
                    break;
                case 4:
                    invertedPyramid(rows);
                    break;
                case 5:
                    running = false;
                    System.out.println("Good bye!");
            }


        }
    }
}
