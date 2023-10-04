package SubstringMethod;

public class Substring {

    public static void main(String[] args) {

        String txt = "you only live once, but if you do it right, once is enough";
        String targetWord = txt.substring(0,1);
        String restSentence = txt.substring(1);
        String targetWordCapitalized = targetWord.toUpperCase();

        //firstWay
        System.out.println(targetWordCapitalized + restSentence);

        //secondWay (most efficient way)
        int capacity = targetWord.length() + restSentence.length();
        String finalResult = new StringBuilder(capacity)
                .append(targetWordCapitalized)
                .append(restSentence).toString();
        System.out.println(finalResult);
    }
}

