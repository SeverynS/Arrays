import java.util.Arrays;
/*
* треугольник Паскаля через рекурсию
* */

public class PascalWithRecursion {
    public static void main(String[] args) {

        int[][] recursionTriangle = new int[10][];
        secondLevelArr(recursionTriangle, 0);
        internalSide(recursionTriangle, 0, 0);

        for (int tri[] :  recursionTriangle) {
            System.out.println(Arrays.toString(tri));
        }
    }

    private static void secondLevelArr(int[][] triangle, int i){

        if(i < 10) {
            triangle[i] = new int[i + 1];
            triangle[i][0] = 1;
            triangle[i][triangle[i].length - 1] = 1;
            i++;
            secondLevelArr(triangle, i);
        }
    }

    private static void internalSide(int[][] triangle, int i, int j) {

        if(i < 10) {
            while (j < triangle[i].length - 1) {
                if (triangle[i][j] == 0) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                j++;
            }
            i++;
            j = 1;
            internalSide(triangle, i, j);
        }
    }
}
