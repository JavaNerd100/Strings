package ConcatMethod;

public class Concat {

    public static void main(String[] args) {

        String textOne = "Once upon a time";
        String textTwo= "There is a mystical land of creatures";

        //first Way
        System.out.println(textOne + " " +textTwo);

        //Second way
        System.out.println(textOne.concat(" ".concat(textTwo)));

        //Third way
        /**
         * StringBuilder and StringBuffer method both are same and work exactly same but StringBuffer
         * method is older version which is made for thread safety. Since vast majority of developer
         * didn't required that level of thread safety so that's why StringBuilder is created
         */
        String usingStringBuilder = new StringBuilder(textOne.length() + textTwo.length()+ 1)
                .append(textOne)
                .append(" ")
                .append(textTwo)
                .toString();
        System.out.println(usingStringBuilder);

        //Fourth way
        String usingStringFormat = String.format("%s %s",textOne,textTwo);
        System.out.println(usingStringFormat);

    }
}
