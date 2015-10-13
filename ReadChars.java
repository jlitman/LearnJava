//use buffered reader to read chars from the console
import java.io.*;

class ReadChars {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.println("Enter characters. Period to quit");

        //read chars
        do {
            c = (char) br.read();
            System.out.println(c);
        } while( c!= '.');
    }
}


