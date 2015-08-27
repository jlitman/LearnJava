class StringOps
{
    public static void main(String args[])
    {
        String str1 = "When it comes to Web programming, Java is #2.";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful";
        int result, index;
        char ch;

        System.out.println("Length of str1: " + str1.length());

        //display str1, one char at a time
        for(int i=0; i < str1.length(); i++)
        {
            System.out.print(str1.charAt(i));
        }
        System.out.println();

        if(str1.equals(str2))
            System.out.println("str1 equals str2");
        else
            System.out.println("str1 does not equal str2");

        if(str1.equals(str3))
            System.out.println("str1 equals str3");
        else
            System.out.println("str1 does not equal str3");
        
        result = str1.compareTo(str3);
        if(result == 0)
        {
            System.out.println("str1 and str3 are equal");
        }
        else if(result < 0)
        {
            System.out.println("str1 is less than str3 ");
        }
        else
        {
            System.out.println("str1 is greater than str3");
        }
        
        //assign a new string to str2
        str2 = "One Two Three One";

        index = str2.indexOf("One");
        System.out.println("Index of first occurrent of One: " + index);
        index = str2.lastIndexOf("One");
        System.out.println("Index of last occurrent of One: " + index);
    }
}
