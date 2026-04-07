public class prog4polynndrom {
    public static void main(String[] args)
    {
        String word="madamm";
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
        {
rev=rev+word.charAt(i);

        }
        if(word.equals(rev))
        {
            System.out.println("Provided string is :"+word+" is a polyndrome string :"+rev);
        }
        else
        {
            System.out.println("Provided string is not polyndrom:"+word);
        }
        //System.out.println("Provided reverse string :"+rev);
    }
}
