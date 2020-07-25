public class Demo { 
    static boolean Palindrome(String str) 
    { 
        int a = 0, b = str.length() - 1; 
        while (a < b) { 
            if (str.charAt(a) != str.charAt(b)) 
                return false; 
            a++; 
            b--; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        String str = "geeks"; 
  
        if (Palindrome(str)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
    } 
}
