class Bubble {
    //Bubble sort an array of strings
    static public void main(String args[]) {
        String strings[] = { "Raising a Modern Day Knight",
            "The Pragmatic Programmer",
            "Java: A Beginner's Guide",
            "Head First Android Development"};

        System.out.println("The original array:");
        for(String x: strings) {
            System.out.println(x);
        }

        //do the sort
        int a,b;
        String t;

        for(a = 1; a < strings.length; a++) {
            for(b = strings.length-1; b >= a; b--) {
                if(strings[b-1].compareTo(strings[b]) > 0) {
                    t = strings[b-1];
                    strings[b-1] = strings[b];
                    strings[b] = t;
                }
            }
        }
        
        System.out.println("\nSorted array:");
        for(String x: strings) {
            System.out.println(x);
        }
    }
}
