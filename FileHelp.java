import java.io.*;
class Help {
    String helpfile; //name of helpfile

    Help(String fname) {
        helpfile = fname;
    }

    boolean helpOn(String what) {
        int ch;
        String topic, info;

        //open the helpfile
        try(BufferedReader helpReader = new BufferedReader(new
                    FileReader(helpfile))) {
            do {
                //read characters until # is found
                ch = helpReader.read();
                if(ch == '#') {
                    topic = helpReader.readLine();
                    if(what.compareTo(topic) == 0) {
                        //found the topic
                        do {
                            info = helpReader.readLine();
                            if(info != null) {
                                System.out.println(info);
                            }
                        }while(info != null && info.compareTo("") != 0);
                        return true;
                    }
                }
            }while(ch != -1);
        } catch(IOException ex) {
            System.out.println("Error accessing help file");
            return false;
        }
        return false;
    }

    String getSelection() {
        String topic = "";
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));

        System.out.println("Enter topic: ");
        try {
            topic = br.readLine();
        } catch(IOException ex) {
            System.out.println("Error reading console");
        }
        return topic;
    }
}

class FileHelp {
    public static void main(String args[]) {
        Help helpObj = new Help("helpfile.txt");
        String topic;

        System.out.println("Try the help system. " +
                " Enter 'stop' to end.");

        do {
            topic = helpObj.getSelection();
            if(!helpObj.helpOn(topic)) {
                System.out.println("Topic not found.\n");
            }
        }while(topic.compareTo("stop") != 0);
    }
}
