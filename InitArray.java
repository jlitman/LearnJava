public class InitArray
{
    public static void main(String[] args)
    {
        int[] array;
        array = new int[10];
        System.out.printf("%s%8s\n", "Index", "Value");

        for(int counter = 0; counter < array.length; counter++)
        {
            System.out.printf("%5d%8d\n", counter, array[counter]);
        }
        //playing with Java's final keyword which is like C++'s const
        final int something = 10;
        //something++;//this gives an error
    }
}
