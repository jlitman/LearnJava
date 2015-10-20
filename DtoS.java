//Simple disk to screen utility that demonstrates FileReader
import java.io.*;

class DtoS {
    public static void main(String args[]) {
        String s;

        //create and use a FileReader wrapped in a BufferedReader
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch(IOException ex) {
            System.out.println("I/O Error: " + ex);
        }
    }
}
