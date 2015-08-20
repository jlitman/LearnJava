class Input
{
    public static void main(String[] args)
     throws java.io.IOException {

       System.out.println("Type whatever you like. Type a period when you are done. I will count the spaces.");
       char ch = ' ';
       int numberOfSpaces = 0;
       while(ch != '.')
       {
           ch = (char) System.in.read();
           //if(ch == '.')
           //    break;
           if(ch == ' ')
               numberOfSpaces++;
       }
       System.out.printf("Found %d spaces.\n", numberOfSpaces);
    }
}
