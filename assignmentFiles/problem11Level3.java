package session4.assignmentFiles;
import java.util.Scanner;

public class problem11Level3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        System.out.print("\nEnter N: ");
        N = input.nextInt();

        System.out.println("\n");

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
        input.close();
    }
}
