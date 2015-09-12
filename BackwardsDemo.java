class Backwards
{
    String myS;
    int stringlen;

    Backwards(String s) {
        myS = s;
        stringlen = myS.length();
    }

    public void backwards(int index) {
       if(index < stringlen - 1) {
           //System.out.println(index);
           backwards(index+1);
       }
       System.out.print(myS.charAt(index));
    }
}

class BackwardsDemo {
    public static void main(String args[])
    {
        String h = "Hello";
        Backwards b = new Backwards(h);
        b.backwards(0);
        System.out.println("");
    }
}
