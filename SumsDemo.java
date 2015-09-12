class Sums {
    
    int sums(int ... v) {
        int total = 0;

        for(int x: v) {
            total += x;
        }
        return total;
    }
}

class SumsDemo {
    static public void main(String args[]) {
        Sums summer = new Sums();
        System.out.println("The sum is "  + summer.sums(1,2,3));
    }
}
