package ArraysProto;


public class ArrayExample3 extends Object {

    public static void main(String[] args) {

        int[][] num2d = new int[2][5];

        num2d[0][0] = 1;
        num2d[0][1] = 2;
        num2d[0][2] = 3;
        num2d[0][3] = 4;
        num2d[0][4] = 5;

        num2d[1][0] = 10;
        num2d[1][1] = 20;
        num2d[1][2] = 30;
        num2d[1][3] = 40;
        num2d[1][4] = 50;

        //or like this :
        int[][] num2dInit = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50}
        };

        // Accessing 2d array with index print
        int index1d, index2d = 0;

        for (int[] num1d : num2d) {
            index1d = 0;
            for (int num : num1d) {
                System.out.println("[" + index2d + "][" + index1d + "] = " + num);
                index1d++;
            }
            index2d++;
        }

        /* Simple print
        for (int[] num1d : num2d) {
            for (int num : num1d) {
                System.out.println(num);
            }
        }*/


    }

}
