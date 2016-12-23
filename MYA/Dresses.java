public class Dresses implements NumberGroup
{
    String style = "";
    int[] sizeList;
    String sizes;
    public Dresses(String style, int[] sizeList)
    {
        this.style = style;
        this.sizeList = sizeList;
    }
    
    
    //NumberGroup method(s)
    public boolean contains(int x)
    {
        for(int counter = 0; counter < this.sizeList.length; counter++)
        {
            if (x == sizeList[counter])
            {
                return true;
            }
        }
        return false;
    }
    
    //setters and getters
    public void setStyle(String style)
    {
        this.style = style;
    }
    
    public void setSizeList(int[] sizeList)
    {
        this.sizeList = sizeList;
    }
    
    public String getStyle()
    {
        return style;
    }
    
    public int[] getSizeList()
    {
        return sizeList;
    }
    
    public String toString()
    {
        String sizes = "";
        for (int counter = 0; counter < sizeList.length; counter++)
        {
            sizes += sizeList[counter] + " ";
        }
        return ("Style: " + style + " SizeList: " + sizes);
    }
}







