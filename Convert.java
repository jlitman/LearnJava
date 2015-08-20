class Convert
{
    public static void main(String[] args)
     throws java.io.IOException {

       System.out.println("Type something. Type a period when you are done.");
       System.out.println("I will convert between upper and lowercase and count the number of conversions.");

       char ch;
       int numberOfConversions = 0;
       do 
       {
           ch = (char) System.in.read();
           if(ch >= 'A' && ch <= 'Z')
           {
               ch +=32;
               System.out.printf("%c", ch);
               numberOfConversions++;
           }
           else if(ch >= 'a' && ch <= 'z')
           {
               ch -= 32;
               System.out.printf("%c", ch);
               numberOfConversions++;
           }
       } while(ch != '.');

       System.out.printf("\nMade %d conversions.\n", numberOfConversions);
    }
}
/* The reason that the printf statements inside the do/while do not print
*  until after the user types '.' (and ENTER), is because the input is 
*  line buffered - nothing is sent to the program until, ENTER is pressed.
*/
