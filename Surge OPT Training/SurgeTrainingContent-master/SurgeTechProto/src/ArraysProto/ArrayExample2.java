package ArraysProto;

public class ArrayExample2 {

    public static void main(String[] args) {

        // array, empty
        int[] num;

        // array of 5
        num = new int[5];
        
        String[] empArray = {"udhay","naz"};

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;
        //num[5] = 6; //ArrayIndexOutOfBoundsException: 5

        System.out.println("num[0] : " + num[0]);
        System.out.println("num[1] : " + num[1]);
        System.out.println("num[2] : " + num[2]);
        System.out.println("num[3] : " + num[3]);
        System.out.println("num[4] : " + num[4]);
        //System.out.println("num[5] : " + num[5]); 

    }

}
