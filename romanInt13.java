import java.util.HashMap;
class romanInt13 {
    public int romanToInt(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans=0,temp=0;

        for(int i=0;i<s.length();i++)
        {
            if(i==s.length()-1)
            {
                ans+=map.get(s.charAt(i));
                break;
            }
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1)))
                temp=0;
            else
                temp=1;
            if(temp==0)
                ans+=map.get(s.charAt(i));
            else
                ans-=map.get(s.charAt(i));
        }

        return ans;
    }
}