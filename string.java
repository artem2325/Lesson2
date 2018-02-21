public class string {
    public static void main(String[] Args) {
        String newString = "Happyworld";
        int stringLength = newString.length();
        int stringDividePlace = stringLength / 2;
        System.out.println("String length: " + stringLength);
        String firsthalf = newString.substring(0, stringDividePlace);
        String secondhalf = newString.substring(stringDividePlace, stringLength);
        System.out.println("First half: " + firsthalf);
        System.out.println("Second half: " + secondhalf);
        System.out.println("Introduced string: " + newString);
    }
}