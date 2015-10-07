/*Display a text file.
  To use this program, specify the name of the file
  to open. For example to view readme.txt use this command:
  java ShowFile readme.txt
*/

import java.io.*;

class ShowFile {
    public static void main(String args[]) throws IOException {
        int i;
        String filename;

        if(args.length != 1) {
            BufferedReader br = new BufferedReader(new 
                    InputStreamReader(System.in));
            System.out.print("Enter file name: ");
            filename = br.readLine();
        }
        else
        {
            filename = args[0];
        }

        //try with resources
        try(FileInputStream fin = new FileInputStream(filename)) {
            //read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            } while( i!= -1);

        } catch(IOException ex) {
            System.out.println("I/O Error: " + ex);
        } 
    }
}
