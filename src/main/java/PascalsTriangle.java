import java.util.Arrays;
/*
* 5) рассмотри треугольник паскаля;
* напиши программу которая будет заполнять такого рода матрицу до 10 уровня по новым темам
 * */
public class PascalsTriangle {
    public static void main(String[] args) {

        for (int tri[] : triangleCreate()) {

            System.out.println(Arrays.toString(tri));
        }
    }

    public static int[][] triangleCreate() {
        int[][] triangle = new int[11][];

        for (int i = 0; i < triangle.length; i++) {

            triangle[i] = new int[i + 1];

        }

        for (int i = 0; i < triangle.length; i++) {

            triangle[i][0] = 1;

            for (int j = 0; j < triangle[i].length; j++) {

                triangle[i][triangle[i].length - 1] = 1;

                if(i >= 2 && i <= triangle[i].length)
                    triangle[i][1] = i;

                if(i >= 3 && i <= triangle[i].length)
                    triangle[i][triangle[i].length - 2] = i;

                if(triangle[i][j] == 0)
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }

        }
        return triangle;
    }

}
