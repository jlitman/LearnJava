/*Display a text file.
  To use this program, specify the name of the file
  to open. For example to view readme.txt use this command:
  java ShowFile readme.txt
*/

import java.io.*;

class ShowFile {
    public static void main(String args[]) 
        throws IOException {
        int i;
        FileInputStream fin;
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

        try {
            fin = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
            return;
        }

        try {
            //read bytes until EOF is encountered
            do {
                i = fin.read();
                if(i != -1) System.out.print((char)i);
            }while( i!= -1);
        } catch(IOException ex) {
            System.out.println("Error reading file");
        }

        try  {
            fin.close();
        }catch (IOException ex){
            System.out.println("Error closing file");
        }
    }
}
