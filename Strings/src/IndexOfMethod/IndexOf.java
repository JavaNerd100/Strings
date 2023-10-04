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
        }else {
            System.out.println("you entered wrong phone number");
        }
    }

    private static String parseIndiaCode(String userInput) {
        String indiaCode = "";


        if (userInput.contains("+91")) {
            int plusSignIndex = userInput.indexOf("+");
            int spaceIndex = userInput.indexOf(" ");
            indiaCode = userInput.substring(plusSignIndex,spaceIndex);
        }else {
            System.out.println("Wrong code");
        }

        return indiaCode;
    }


    private static String parseOperatorCode(String userInput) {

        String operatorCode = "";


        if (userInput.matches("([\s]*\\d{3}[\s][-])")) {
            int spaceIndex = userInput.indexOf(" ");
            int hypenIndex = userInput.indexOf("-");
            operatorCode = userInput.substring(spaceIndex,hypenIndex);
        }else {
            System.out.println("Wrong operator code");
        }

        return operatorCode;
    }



    private static String parseSubscriberCode(String userInput) {
//        String indiaCode = "";
//
//
//        if (userInput.contains("+91")) {
//            int plusSignIndex = userInput.indexOf("+");
//            int spaceIndex = userInput.indexOf(" ");
//            indiaCode = userInput.substring(plusSignIndex,spaceIndex);
//        }else {
//            System.out.println("Wrong code");
//        }

        return null;
    }


}
