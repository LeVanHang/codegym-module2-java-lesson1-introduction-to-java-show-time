import java.util.Scanner;

public class md2_ex_numberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        String result;
        if(number <= 10 && number >= 0){
            switch (number){
                case 0:
                    System.out.println("zero");
                case 1:
                    System.out.println("one");
                case 2:
                    System.out.println("two");
                case 3:
                    System.out.println("three");
                case 4:
                    System.out.println("four");
                case 5:
                    System.out.println("five");
                case 6:
                    System.out.println("six");
                case 7:
                    System.out.println("seven");
                case 8:
                    System.out.println("eight");
                case 9:
                    System.out.println("nine");
                case 10:
                    System.out.println("ten");
            }
        }
        else if(number < 20){
            switch (number){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
                default:
                    return;
            }
        }
        return;
    }
}
