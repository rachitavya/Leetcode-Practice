//https://leetcode.com/problems/two-sum/description/
import java.util.HashMap;
class twoSum1
{
    public int[] twoSum(int nums[],int target)
    {
        // int n=nums.length;
        // for(int i=0;i<n-1;i++)
        //     for(int j=i+1;j<n;j++)
        //         if(nums[i]+nums[j]==target)
        //             return new int[] {i,j};
        // return null;
        HashMap<Integer,Integer> sum=new HashMap<Integer,Integer>();
        int n=nums.length;
        for(int i=0;i<n;i++)
            sum.put(nums[i],i);
        for(int i=0;i<n;i++)
        {
            int x=target-nums[i];
            if(sum.containsKey(x) && i!=sum.get(x))
                return new int[] {i,sum.get(x)};

        }
            

        return null;
    }
}