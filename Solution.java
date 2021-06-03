import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String[] reverse = reverseMethod(input);

        print(reverse);

    }

    private static void print(String[] reverse) {
        for (int i = 0; i < reverse.length; i++) {
            System.out.print(reverse[i] + " ");
        }
    }

    private static String[] reverseMethod(String[] input) {
        String[] reversedArrayList = new String[input.length];
        int count = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            reversedArrayList[count] = input[i];
            count++;
        }
        return reversedArrayList;
    }
}