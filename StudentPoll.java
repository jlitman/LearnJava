public class StudentPoll
{
    public static void main(String[] args)
    {
        //student response array
        int[] responses = {1,2,5,4,3,5,2,1,3,3,1,4,3,3,2,3,3,2,14};
        int[] frequency = new int[6];

        //for each answer, select responses element and use that value as
        //frequency index to determine element to increment
        for(int answer = 0; answer < responses.length; ++answer)
        {
            try
            {
                ++frequency[responses[answer]];
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf(" responses[%d] = %s\n\n", answer,
                        responses[answer]);
            }
        }
        System.out.printf("%s %s\n", "Rating", "Frequency");

        for(int rating = 1; rating < frequency.length; ++rating)
        {
            System.out.printf("%6d %d\n", rating, frequency[rating]);
        }
    }
}
                       
         
