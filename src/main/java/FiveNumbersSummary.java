import java.util.Scanner;
/*
* 2) Переписать программу из предыдущего задания так, чтобы считалась сумма введенных числе
* */

public class FiveNumbersSummary {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Введите первое число:");
        array[0] = scanner.nextInt();

        System.out.println("Введите второе число:");
        array[1] = scanner.nextInt();

        System.out.println("Введите третье число:");
        array[2] = scanner.nextInt();

        System.out.println("Введите четвёртое число:");
        array[3] = scanner.nextInt();

        System.out.println("Введите пятое число:");
        array[4] = scanner.nextInt();

        for(int i : array) {
                sum += i;
        }
            System.out.println("Сумма введённых чисел - " + sum);
    }
}
