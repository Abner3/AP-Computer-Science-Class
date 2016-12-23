public class Code
{
    private String myCode, CCmyCode, xString = "X";
    
    
    public Code(String code)
    {
        myCode = code;
        CCmyCode = myCode;
    }
    
    public String getCode()
    {
        return myCode;
    }
    
    public void hide( int p1, int p2 )
    {
        String hidden = "";
        hidden = CCmyCode.substring(0,p1-1);
        for (int counter = p2; counter >= p1; counter--)
        {
            hidden += "X";
        }
        hidden += CCmyCode.substring(p2,CCmyCode.length());
        myCode = hidden;
    }
    
    public void recover( int p1, int p2 )
    {
        String recover = "";
        recover = CCmyCode.substring(0,p1);
        for (int counter = p2; counter > p1; counter--)
        {
            recover += xString;
        }
        recover += CCmyCode.substring(p2,CCmyCode.length());
        myCode = recover;
    }
}
