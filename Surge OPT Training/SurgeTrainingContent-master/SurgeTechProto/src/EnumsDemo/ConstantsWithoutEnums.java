package EnumsDemo;

class ConstantsWithoutEnumsSample
{
    public static final String north = "NORTH";
    public static final String south = "SOUTH";
    public static final String east = "EAST";
    public static final String west = "WEST";
}
 
public class ConstantsWithoutEnums
{
    public static void main(String[] args)
    {
        System.out.println(ConstantsWithoutEnumsSample.north);
        System.out.println(ConstantsWithoutEnumsSample.south);
        System.out.println(ConstantsWithoutEnumsSample.east);
        System.out.println(ConstantsWithoutEnumsSample.west);
    }
}
