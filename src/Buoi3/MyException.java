package Buoi3;

public class MyException extends Exception{
    public MyException(String message) {
        super(message);
    }
}
 class Mains {
     public static void main(String args[]) {
        try {
            throw new MyException("GeeksGeeks");
        } catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}

