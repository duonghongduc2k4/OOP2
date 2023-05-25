package Buoi3;

import java.util.Scanner;

public class Triangle extends Exception {
    public Triangle(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh của hình tam giác:");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        try {
            checkTriangleValidation(a, b, c);
            System.out.println("Hình tam giác hợp lệ!");
        } catch (Triangle e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void checkTriangleValidation(double a, double b, double c) throws Triangle {
        if (a <= 0 | b <= 0 | c <= 0) {
            throw new Triangle("Các cạnh của hình tam giác phải lớn hơn 0.");
        }

        if (a + b <= c && a + c <= b && b + c <= a) {
            throw new Triangle("Tổng hai cạnh của hình tam giác phải lớn hơn cạnh còn lại.");
        }
    }
}




