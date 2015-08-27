class ForEach2
{
   public static void main(String args[])
   {
       int nums[][] = new int[3][5];
       int sum=0;
       //put some values in the multidimensional array
       for(int i = 0; i < 3; i++)
       {
            for(int j=0; j < 5; j++)
            {
                nums[i][j] = (i+1)*(j+1);
            }
       }

       //use for-each loop to display
       for(int x[]: nums)
       {
           for(int y: x)
           {
                sum += y;
                System.out.println("Value is: " + y);
           }
       }
       System.out.println("Total is " + sum);
   }
}
