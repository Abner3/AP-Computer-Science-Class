public class CodeTester
{
    public static void main( String[] args )
    {
        Code code = new Code( "ABCdef123ghi456jklMNO");
        System.out.println(code.getCode() + "\n");
        code.hide(2,7);
        System.out.println(code.getCode() + "\n");
        code.recover(5,9);
        System.out.println(code.getCode() + "\n");        
        code.hide(3,14);
        System.out.println(code.getCode() + "\n");
        code.hide(6,10);
        System.out.println(code.getCode() + "\n"); 
        code.recover(5,6);
        System.out.println(code.getCode() + "\n");
        code.recover(0,14);
        System.out.println(code.getCode() + "\n");
    }
}