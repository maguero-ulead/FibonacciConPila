package cr.ac.ulead;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Scanner input = new Scanner(System.in);
    private static PrintStream output = new PrintStream(System.out);

    public static void main(String[] args) {
	    ExecuteFibonnaci();
    }

    private static void ExecuteFibonnaci() {
        Stack<Integer> stack = new Stack<>();
        int number = input.nextInt();
        stack.push(number);
        int result = 0;
        int topNumber = 0;
        while (!stack.empty()) {
            topNumber = stack.pop();
            if (topNumber == 1) {
                result = result + 1;
            } else if (topNumber == 0) {
                result = result + 0;
            } else {
                stack.push(topNumber - 1);
                stack.push( topNumber - 2);
            }
        }
        output.println("Fibonacci value of " + number + " is " + result);


    }
}
