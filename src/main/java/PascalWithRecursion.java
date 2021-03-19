import java.util.Arrays;
/*
* треугольник Паскаля через рекурсию
* */

public class PascalWithRecursion {
    public static void main(String[] args) {

        int[][] recursionTriangle = new int[10][];
        secondLevelArr(recursionTriangle, 0);
        externalSide(recursionTriangle, 0);
        internalSide(recursionTriangle, 0, 0);

        for (int tri[] :  recursionTriangle) {
            System.out.println(Arrays.toString(tri));
        }
    }

    private static void secondLevelArr(int[][] triangle, int i){
        int temp = i;

        if(temp < 10) {
            triangle[temp] = new int[temp + 1];
            temp++;
            secondLevelArr(triangle, temp);
        }
    }

    private static void externalSide(int[][] triangle, int i) {
        int temp = i;

        if(temp < 10) {
            triangle[temp][0] = 1;
            triangle[temp][triangle[temp].length - 1] = 1;

            if(temp >= 2) {
                triangle[temp][1] = temp;
            }

            if(temp >= 3) {
                triangle[temp][triangle[temp].length - 2] = temp;
            }

            temp++;
            externalSide(triangle, temp);
        }
    }

    private static void internalSide(int[][] triangle, int i, int j) {

        int tempi = i;
        int tempj = j;

        if(tempi < 10) {
            while (tempj < triangle[tempi].length - 1) {
                if (triangle[tempi][tempj] == 0) {
                    triangle[tempi][tempj] = triangle[tempi - 1][tempj - 1] + triangle[tempi - 1][tempj];
                }
                tempj++;
            }
            tempi++;
            tempj = 1;
            internalSide(triangle, tempi, tempj);
        }
    }
}
