package LengthMethod;

import java.util.Scanner;

public class Length {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text");
        String userInput = sc.nextLine();
        char[] charArray = userInput.toCharArray();
        System.out.println("Enter index number you want to found");
        int userNumberInput = sc.nextInt();
        if (userNumberInput < userInput.length()) {
            System.out.println(charArray[userNumberInput]);
            }
    }
}
