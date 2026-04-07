public class Prog2ReverseString {
    public static void main(String[] args)
    {
        String word="Krishna maurya";
        String rev="";
        for(int i=word.length() -1;i>=0;i--)
        {
            rev=rev+word.charAt(i);
        }
        System.out.println("Original String is :"+word);
        System.out.println("Reverse String is :"+rev);
    }
    
}
