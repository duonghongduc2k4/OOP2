package Tuan7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        String string = new String("Welcome to java");
        StringBuilder stringBuilder = new StringBuilder(string);

//        System.out.println(stringBuilder.append("script"));
//        System.out.println(stringBuilder.insert(11,"HTML and "));
//        System.out.println(stringBuilder.replace(10,14,"html"));
        System.out.println(stringBuilder.toString());
    }
}
