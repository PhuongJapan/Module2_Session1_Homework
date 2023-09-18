package Session1;

import java.util.Scanner;

public class Session1_hw3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int square = a*b;
        System.out.println("Diện tích là: "+ square);
        float width;
        float height;
        //Câu lệnh cho nhập dữ liệu viết chung cho input, viết 1 lần
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều rộng: ");
        width = scanner.nextFloat();//Nhập chiều rộng
        System.out.println("Nhập chiều dài: ");
        height = scanner.nextFloat();
        float squareValue = width*height;
        System.out.println("Diện tích là: "+squareValue);


    }
}
