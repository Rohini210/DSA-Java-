import java.util.Scanner;

class Solution 
{
    public boolean validPalindrome(String s) 
    {
        
        int i=0;
        int j = s.length()-1;
        
        while(i<j)
        {
            if(s.charAt(i) != s.charAt(j))
            {
               return (isPalin(s, i+1, j) || isPalin(s, i, j-1));
            }
            
            i++;
            j--;
        }
        
        return true;
        
    }
    
    public boolean isPalin(String str, int i, int j)
    {
        while(i<j)
        {
            if(str.charAt(i++) != str.charAt(j--))
            {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if(validPalindrome(str))
        {
            System.out.println("Yes, we can make the string palindrome by deleting atmost one character.");
        }
        else
        {
            System.out.println("No, we can make the string palindrome by deleting atmost one character.");
        }
        
    }
}
