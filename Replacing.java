public class Replacing {
    public static void main(String[] Args) {
        String newString = "#?#?###?";
        String replacingSymbols = newString.replace("#", "DO NOT REPLACE ME! ");
        String deletingSymbols = replacingSymbols.replace("?", "");
        System.out.println("Introduced string: " + newString);
        System.out.println("Edited string: " + deletingSymbols);
    }
}
