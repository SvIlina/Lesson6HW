package task3;

public class Name {

    public static String reverseName(String name) {
        String buffer = "";
        for (int i = name.length()-1; i >=0; i--) {
            buffer += String.valueOf(name.charAt(i));
        }
    return buffer;
    }


}