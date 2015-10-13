//use buffered reader to read lines from the console
import java.io.*;

class ReadLines {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit");

        //read chars
        do {
            str = br.readLine();
            System.out.println(str);
        } while( !str.equals("stop"));
    }
}


