import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int result = 0;
        System.out.print("Input an integer between 0 and 1000:");
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        if (0 < inputValue && inputValue < 1000) {
            String[] arr = String.valueOf(inputValue).split("");
            for (int i = 0;i<arr.length;i++){
                result += Integer.parseInt(arr[i]);
            }
            System.out.print("The sum of all digits in 565 is:" + result);
        }
    }
}
