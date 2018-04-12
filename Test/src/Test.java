class Derived 
{
    private   void getDetails(String temp)
    {
        System.out.println("Derived class " + temp);
    }
}
 
public class Test extends Derived
{
    private  void getDetails(String temp)
    {
        System.out.println("Test class " + temp);
        //return 0;
    }
    public static void main(String[] args)
    {
    	Test obj = new Test();
    	obj.getDetails("GFG");
    }
}