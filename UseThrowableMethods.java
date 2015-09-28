class ExTest {
    static void genException() {
        int nums[] = new int[4];
        System.out.println("Before exception is generated");
        nums[7] = 10;
        System.out.println("This will not display");
    }
}

class UseThrowableMethods {
    public static void main(String args[]) {
        try {
            ExTest.genException();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Standard message is: ");
            System.out.println(ex);
            System.out.println("\nStack trace: ");
            ex.printStackTrace();
        }
    }
}
