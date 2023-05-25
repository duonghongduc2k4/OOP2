package Tuan7;

import java.util.regex.Pattern;

public class NumberPhone {
    public static void main(String[] args) {
        boolean b = Pattern.matches("^\\([\\d]{2}\\)-\\([0\\d]{10}\\)$","(a8)-(22222222)");
        System.out.println(b);
    }
}
