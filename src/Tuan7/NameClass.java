package Tuan7;

import java.util.regex.Pattern;

public class NameClass {
    public static void main(String[] args) {
        boolean b = Pattern.matches("^[A|C|P][\\d]{4}[G|H|I|K]$","M0318G");
        System.out.println(b);
    }
}
