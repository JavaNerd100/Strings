package CompareToMethod;

public class CompareToAndCompareToIgnoreCase {
    public static void main(String[] args) {

        String firstText = "Pineapple";
        String secondText = "Banana";
         System.out.println(firstText.compareTo(secondText));
        System.out.println(firstText.compareToIgnoreCase(secondText));

        String firstText1 = "Pineapple";
        String secondText2 = "Banana";
         System.out.println(firstText.compareTo(firstText1));
        System.out.println(firstText.compareToIgnoreCase(secondText2));

    }
}
