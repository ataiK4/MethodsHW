import java.util.Scanner;
public class StudentGrader {
    public static String calculateGrade(int score) {
        if (score < 0 || score > 100)
            return "Invalid score";
        if (score >= 90)
            return "A";
        else if (score >= 80)
            return "B";
        else if (score >= 70)
            return "C";
        else if (score >= 60)
            return "D";
        else
            return "F";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 111 to exit");
        while (true) {
            System.out.print("Enter a score: ");
            int score = scanner.nextInt();
            if (score == 111)
                break;
            System.out.println(calculateGrade(score));
        }
    }
}
