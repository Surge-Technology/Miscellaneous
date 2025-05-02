package EnumsDemo;
enum sampleEnum
{
    A, B, C;
 
    int i=90;  //enums can have fields
 
    private sampleEnum()
    {
        //enums can have Constructor
    }
 
    void methodOfEnum()
    {
    	System.out.println("methodOfEnum called...");
    }
}


public class EnumsExampleDemo2
{
    public static void main(String[] args)
    {
    	sampleEnum en = sampleEnum.A;
        System.out.println(en.i);  //Constant A has field i
        en.methodOfEnum();         //Constant A has methodOfEnum()
 
        sampleEnum en1 = sampleEnum.B;
        System.out.println(en1.i);  //Constant B has field i
        en1.methodOfEnum();         //Constant B has methodOfEnum()
 
        sampleEnum en2 = sampleEnum.C;
        System.out.println(en2.i);   //Constant C has field i
        en2.methodOfEnum();          //Constant C has methodOfEnum()
    }
}
