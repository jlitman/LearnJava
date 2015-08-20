class Primes
{
    static public void main(String[] args)
    {
       System.out.println("Primes from 2 to 10 are:");
       for(int i = 2; i < 11; i++)
       {
           boolean  prime = true;
           int divisor = i/2;
           while(divisor > 1)
           {
               if(i % divisor == 0)
               {
                   prime = false;
                   break;
               }
               divisor--;
           }
           if(prime)
               System.out.printf("%d ", i);
       }
       System.out.println("");
    }
}
