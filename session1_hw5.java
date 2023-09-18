package Session1;

import java.util.Scanner;

public class session1_hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int usd;
        int rate = 23000;

        System.out.println("Nhập số tiền: ");
        usd = scanner.nextInt();
        float result = usd*rate;
        System.out.println("Số tiền VND là: "+result);
    }
}
