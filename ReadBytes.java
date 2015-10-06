import java.io.*;
//read array of bytes from keyboard
class ReadBytes {
    public static void main(String args[]) 
        throws IOException {
        byte data[] = new byte[10];

        System.out.println("Enter some characters");
        System.in.read(data);
        System.out.println("You entered: ");
        for(byte i:data) {
            System.out.println((char) i);
        }
    }
}
