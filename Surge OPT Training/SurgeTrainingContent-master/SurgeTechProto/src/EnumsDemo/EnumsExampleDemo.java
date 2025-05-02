package EnumsDemo;

//https://javaconceptoftheday.com/java-enums-tutorial-with-examples/
enum Directions
{
    NORTH, SOUTH, EAST, WEST;
}
enum Days
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}


//enum DirectionsDuplicate
//{
//    NORTH, SOUTH, EAST, WEST, WEST;
//}
 
public class EnumsExampleDemo
{
    public static void main(String[] args)
    {
        Directions d1 = Directions.EAST;
        System.out.println(d1);
 
        Directions d2 = Directions.NORTH;
        System.out.println(d2);
 
        System.out.println(Directions.SOUTH);
 
        System.out.println(Directions.WEST);
    }
}