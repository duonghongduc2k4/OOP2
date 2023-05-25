package Tuan7;

import java.util.regex.Pattern;

public class account {
    public static void main(String[] args) {
        boolean b = Pattern.matches("^[_a-z0-9]{6,}$","abcdefg");
        System.out.println(b);
    }
}
