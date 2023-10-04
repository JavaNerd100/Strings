package StripAndTrimMethod;

public class StripAndTrim {
    public static void main(String[] args) {
        /**
         *Strip method is latest method whereas
         * trim method is oldest version method.
         */
        String strip = "  Jack the ripper   ";
        System.out.format("'%s'",strip.strip());
    }
}
