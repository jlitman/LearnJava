class VarArgs {
    static void vaTest(int...v) {
        System.out.println("Number of args: " + v.length);
        System.out.print("Contents of args: ");
        for(int x:v)
        {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        vaTest(10);
        vaTest(2,3,4);
        vaTest();
    }
}
