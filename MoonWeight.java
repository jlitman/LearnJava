public class MoonWeight
{
    public static void main(String[] args)
    {
        double moonToEarthConversion = 0.17;
        double myEarthWeight = 165; //lbs
        double moonWeight = myEarthWeight * moonToEarthConversion;
        System.out.printf("Earth weight:  %f  (lbs). Moon weight:  %f (lbs).\n", myEarthWeight, moonWeight);
    }
}
