import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.print("输入算式：");
        Scanner scanner = new Scanner(System.in);
        String express = scanner.nextLine();
        Calculator calculator = new Calculator(express);
        try {
            System.out.println(calculator.calculate());
        } catch (FormatException e) {
            e.printStackTrace();
        }
    }
}
