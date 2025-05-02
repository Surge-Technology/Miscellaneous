package ArraysProto;


import java.util.Arrays;


public class ArrayDemo {
	
	protected int age = 10;

    public static void main(String[] args) {

        //declares an array of integers
        int[] num1 = new int[5];
        int[] num2 = {1, 2, 30, 4, 50};
        int[] num3 = new int[]{1, 2, 3, 4, 5};

		// index starts with 0
        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;

		// print array
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
        System.out.println(Arrays.toString(num3));
        
        System.out.println(num3.hashCode());
        System.out.println(num2.hashCode());
        System.out.println(num1.hashCode());
        System.out.println(num3.hashCode());

    }

}

