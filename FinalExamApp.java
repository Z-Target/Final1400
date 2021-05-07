import java.util.Scanner;

public class FinalExamApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        String[] line = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(line[0]);
        int cols = Integer.parseInt(line[1]);

        FinalExam f = new FinalExam(rows, cols);
        int[][] data = f.createArray();
        for (int a = 0; a < data.length; a++) {
            System.out.print("[");
            for (int b = 0; b < data[0].length - 1; b++) {
                System.out.print(data[a][b] + ", ");
            }
            if (data[0].length != 0) {
                System.out.print(data[a][data[0].length - 1]);
            }
            System.out.print("]\n");
        }
        System.out.println("Total: " + f.calculateArray(data));

    }
}
