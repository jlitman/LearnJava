package bookpackext;

class ExtBook extends bookpack.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t,a,d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {return publisher;}
    public void setPublisher(String p) { publisher = p;}

    //these are ok because subclass can access protected members
    public String getTitle() {return title;}
    public void setTitle(String t) {title = t;}
    public String getAuthor() {return author;}
    public void setAuthor(String a) {author = a;}
    public int getPubDate() {return pubDate;}
    public void setPubDate(int d) {pubDate = d;}
}

class ProtectDemo {
    public static void main(String args[]) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("java","schildt", 2014, "McGraw-Hill");
        books[1] = new ExtBook("C++", "Soustroup", 1990, "Wiley");
        books[2] = new ExtBook("Lord of the Rings", "Tolkien", 1953,
                "Penguin");
        books[3] = new ExtBook("Art of War", "SunTzu", 3, "Unknown");
        books[4] = new ExtBook("Android Development", "Griffiths", 2014,
                "OReilly");

        //print all books
        for(ExtBook x: books) {
            x.show();
        }

        System.out.println("Books by Tolkien:");
        for(ExtBook x: books) {
            if(x.getAuthor() == "Tolkien")
                System.out.println("   " + x.getTitle());
        }

    }
}
