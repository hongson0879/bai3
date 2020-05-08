
package project;
 
import java.text.DecimalFormat;
import java.util.Scanner;
 
public class cong {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nhập vào số thứ nhất: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nhập vào số thứ hai: ");
        int secondNumber = scanner.nextInt();
         
        // 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // làm tròn thương đến 2 chữ số thập phân
         
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
         
        // 2. Sử dụng các toán tử so sánh đã học để so sánh 2 số đó.
        System.out.println("Kết quả so sánh bằng 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber == secondNumber));
        System.out.println("Kết quả so sánh không bằng 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber != secondNumber));
        System.out.println("Kết quả so sánh lớn hơn 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber > secondNumber));
        System.out.println("Kết quả so sánh lớn hơn hoặc bằng 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber >= secondNumber));
        System.out.println("Kết quả so sánh nhỏ hơn 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber < secondNumber));
        System.out.println("Kết quả so sánh nhỏ hơn hoặc bằng 2 số " + firstNumber + " và " + 
                secondNumber + " là " + (firstNumber <= secondNumber));
    }
 
}