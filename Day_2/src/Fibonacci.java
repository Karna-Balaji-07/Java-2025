import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        // iterative approach
        int first = 0;
        int next = 1;
        for (int i = 0; i < num - 1; i++) {
            int temp = first + next;
            first = next;
            next = temp;
            System.out.println(temp);


        }
    }
}
