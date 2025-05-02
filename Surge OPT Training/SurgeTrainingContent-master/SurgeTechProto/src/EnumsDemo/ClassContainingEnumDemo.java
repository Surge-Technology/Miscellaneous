package EnumsDemo;


class ClassContainingEnum
{
    enum sampleEnum
    {
        A, B, C
    }
}
 
public class ClassContainingEnumDemo
{
    public static void main(String[] args)
    {
        System.out.println(ClassContainingEnum.sampleEnum.A);  //Accessing enums directly using class name
    }
}