class ThrowsDemo {
    //note that throws is part of the method name declaration
    public static char prompt(String str) 
        throws java.io.IOException {
            System.out.println(str + ": ");
            return (char) System.in.read();
        }

    public static void main(String args[]) {
        char ch;

        try {
            ch = prompt("Enter a letter");
        }
        catch(java.io.IOException ex) {
            System.out.println("I/O Exception occurred.");
            ch = 'X';
        }

        System.out.println("You pressed " + ch);
    }
}
