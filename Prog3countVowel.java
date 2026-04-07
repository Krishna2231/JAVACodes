public class Prog3countVowel {
    public static void main(String[] args)
    {
      String word="krishna maurya";
      int cnt=0;
      for(int i=0;i<=word.length()-1;i++)
      {
       if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i'  || word.charAt(i)=='u')
       {
        cnt=cnt+1;
        System.out.println("Vowels are :"+word.charAt(i));
       }
       
      }
      System.out.println("Total number of vowels are :"+cnt);
    }
    
}
