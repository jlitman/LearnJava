class Phonebook
{
    public static void main(String args[])
    {
        String numbers[][] = {
            {"Joe", "123-4567"},
            {"Yo", "234-5678"},
            {"Mo", "345-6789"},
            {"bob", "456-7890"}
        };
        int i;

        if(args.length != 1)
        {
            System.out.println("Usage: java Phonebook name");
        }
        else
        {
            for(i = 0; i < numbers.length; i++)
            {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                            numbers[i][1]);
                break;
                }
            }
            if(i == numbers.length)
                System.out.println("Name not found");
        }
    }
}

