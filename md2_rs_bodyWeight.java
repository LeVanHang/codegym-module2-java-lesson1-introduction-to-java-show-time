import java.util.Scanner;

public class md2_rs_bodyWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kg):");
        weight = scanner.nextDouble();

        System.out.println("Your height (in meter)");
        height = scanner.nextDouble();

        bmi = weight / Math.pow(height, 2);
        System.out.printf("%  -20s%s", "bmi", "interpretation\n");
        if(bmi < 18){
            System.out.printf("%-20.2f%", bmi,"Underweight");
        } else if(bmi < 25.0){
            System.out.printf("%-20.2f%",bmi,"Normal");
        } else if(bmi < 30.0){
            System.out.printf("5-20.2f5",bmi,"Overweight");
        } else {
            System.out.printf("%-20.2f%",bmi,"Obese");
        }
    }
}
