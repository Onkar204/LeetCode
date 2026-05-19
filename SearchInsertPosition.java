public class SearchInsertPosition
{
    public static void main(String args[])
    {
        int num[]={1,2,3,4,5};
        int target=9;
        
        int result=SearchInsertPosition(num,target);
        System.out.print(result);
    }
    public static int SearchInsertPosition(int[] num,int target)
    {
        int low=0;
        int high=num.length-1;
        
        
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]<target)
            {
                low=mid+1;
            }
            else{
                high=mid-1;
            }
            
        }
        return low;
    }
}