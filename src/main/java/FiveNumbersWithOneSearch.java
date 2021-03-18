import java.util.Scanner;

/*
* 1) Написать программу, заводящую массив из 5 целых чисел, заполняющую
его числами, введенными с клавиатуры, и печатающую, сколько раз в этом
массиве встречается цифра 1.
* */
public class FiveNumbersWithOneSearch {
    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

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
            if(i == 1)
                counter++;
        }
        if(counter <= 5 && counter >= 2)
            System.out.println("1 встречается в массиве - " + counter + " раза");
        else
            System.out.println("1 встречается в массиве - " + counter + " раз");
    }
}
