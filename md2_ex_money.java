import java.util.Scanner;

public class md2_ex_money {
    public static void main(String[] args) {
        float USD;
        float VND = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input usd: ");
        USD = scanner.nextFloat();
        float conversion = USD * VND;
        System.out.println("value" + USD + "USD = " + conversion + " VND");

    }
}
