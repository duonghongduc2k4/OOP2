package Tuan7;

import java.util.regex.Pattern;

public class Email {
    public static void main(String[] args) {
       boolean b =  Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$","ab@gmail.com");
        System.out.println(b);
    }
}
