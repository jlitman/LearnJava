package bookpack;

class Book {
    private String title;
    private String author;
    private int pubDate;

    Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}

class BookDemo {
    public static void main(String args[]) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new Book("Java for Monkeys", "Shakespeare", 1602);
        books[2] = new Book("Red Storm Rising","Clancy", 1986);
        books[3] = new Book("Bourne Identity","Ludlum", 1994);//date??
        books[4] = new Book("How to Cook an Elephant", "Child", 1948);

        for(Book x: books) {
            x.show();
        }
    }
}
