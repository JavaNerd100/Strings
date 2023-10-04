package ContentEqualsMethod;

public class ContentEquals {

    public static void main(String[] args) {
        String firstTxt = "Apple";
        String anotherTxt = "Apple";
        StringBuilder secondTxt = new StringBuilder("Apple");
        /**
         * contentEquals and equals method are sort of same but
         * equals() method will work on same data type it means
         * it will return true only if the data type and content of
         * both the objects should be same whereas in contentEquals() method will
         * also work if the data type is different and content is same.
         *
         */
        System.out.println(firstTxt.contentEquals(secondTxt));
        System.out.println(firstTxt.equals(anotherTxt));
    }
}
