public class IntToRoman 
{
    public static String IntToRoman(int num)
    {
        int value[]={
            1000,900,500,400,100,90,50,40,10,9,5,4,1
            
        };
        
        String symbol[]={
            "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"
        };
        
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<value.length;i++)
        {
            while(num>=value[i])
            {
                result.append(symbol[i]);
                num-=value[i];
            }
        }
        return result.toString();
    }
    public static void main(String args[])
    {
        System.out.println(IntToRoman(89));
        System.out.println(IntToRoman(900));
        System.out.println(IntToRoman(567));
        System.out.println(IntToRoman(1000));
    }
}