/*
* 3)Дан массив натуральных чисел. Найти сумму элементов, кратных 5
* */
public class FindDivByFive {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{5,11,25,13,7,14,20,22,15};
        for(int i : arr) {
            if(i % 5 == 0)
                sum += i;
        }
        System.out.println("The sum of \\5 is: " + sum);
    }
}
