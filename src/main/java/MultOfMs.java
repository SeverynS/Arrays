/*
* 4) Дан массив целых положительных чисел. Найти произведение
* только тех чисел, которые больше заданного числа М. Если таких нет, то выдать
* сообщение об этом.
* */

public class MultOfMs {
    public static void main(String[] args) {
        System.out.println(sumBySomth(5));
    }

    public static String sumBySomth(int somth) {
        String result;
        int[] arr = new int[]{5, 7, 10, 22, 8, 15};
        int k = 1;
        for (int i : arr) {
            if (i > somth)
                k *= i;
        }
        if (k != 0)
            result = "The multiplication of digits bigger then " + somth + " is: " + k;
        else
            result = ("Bigger then " + somth + " digits not found");

        return result;
    }
}