import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        char[][] array = new char[n][m];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {


                array[i][j] = '#';
                System.out.print(array[i][j]);

            }

        }
    }
}