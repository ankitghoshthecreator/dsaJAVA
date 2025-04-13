package functiuonsAndMethods;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int c = add(a, b);  // Static method call
        System.out.println(c);
    }

    // Make add() static so it can be called without object creation
    static int add(int a, int b) {
        return a + b;
    }
}