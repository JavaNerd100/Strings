package IndexOfMethod;

import java.util.Scanner;

public class IndexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Indian phone number");
        String userInput = sc.nextLine().strip();

        //+91 - india code
        //7247 - operator code
        //522473 - unique code of subscriber
        // +91 7247-522473

        String indiaCode = parseIndiaCode(userInput);
        String operatorCode = parseOperatorCode(userInput);
        String subscriberCode = parseSubscriberCode(userInput);
        if (!indiaCode.isEmpty() && !operatorCode.isEmpty() && !subscriberCode.isEmpty()) {
            System.out.println("your india code -->" + indiaCode);
            System.out.println("your operator code -->" + operatorCode);
            System.out.println("your subscriber code -->" + subscriberCode);
        }else {
            System.out.println("You entered wrong phone number that contains no spaces and wrong character !!");
        }
    }

    private static String parseIndiaCode(String userInput) {
        String indiaCode = "";

        if (userInput.matches("[[+]91]{3}[\\s]?\\d{4}[-\\s]?\\d{6}") && userInput.contains(" ")) {
            int plusSignIndex = userInput.indexOf("+");
            int spaceIndex = userInput.indexOf(" ");
            indiaCode = userInput.substring(plusSignIndex,spaceIndex);
        }

        return indiaCode;
    }


    private static String parseOperatorCode(String userInput) {

        String operatorCode = "";


        if (userInput.matches("[[+]91]{3}[\\s]?\\d{4}[-\\s]?\\d{6}") && userInput.contains(" ")) {
            int spaceIndex = userInput.indexOf(" ");
            int hypenIndex = userInput.indexOf("-");
            operatorCode = userInput.substring(spaceIndex + 1,hypenIndex);
        }
        return operatorCode;
    }



    private static String parseSubscriberCode(String userInput) {
        String subscriberCode = "";


        if (userInput.matches("[[+]91]{3}[\\s]?\\d{4}[-\\s]?\\d{6}") && userInput.contains(" ")) {
            int hypenIndex = userInput.indexOf("-");
            subscriberCode = userInput.substring(hypenIndex  + 1);
        }

        return subscriberCode;
    }






}
