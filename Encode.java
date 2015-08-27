class Encode {
    static public void main(String args[]){
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgh";

        System.out.println("Original message: " + msg);

        //encode
        int j = 0;
        for(int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            if( j == key.length() - 1)
                j = 0;
        }

        System.out.println("Encoded message: " + encmsg);

        //decode
        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            if( j == key.length() - 1)
                j = 0;
        }

        System.out.println("Decoded message: " + decmsg);
    }
}
