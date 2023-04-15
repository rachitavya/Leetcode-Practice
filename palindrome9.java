//https://leetcode.com/problems/palindrome-number/description/
class palindrome9 {
    public boolean isPalindrome(int x) 
    {
        int n=x,d,r=0;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        return (r==x && r>=0);
    }
}