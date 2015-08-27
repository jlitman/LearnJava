class CmdlineDemo
{
    public static void main(String args[])
    {
       System.out.println("There are " + args.length + 
       " command line arguments");
      
        System.out.println("Arguments are:");
        for(String x: args)
        {
            System.out.println(x);
        }
    }
}

