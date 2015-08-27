class Average {

    static public void main(String args[]) {
        double nums[] = {23, 102, 21, 9, 45, 65, 43, 890, 32, 294};
        double sum = 0;

        for(double x: nums) {
            sum += x;
        }

        System.out.println("The average is " + sum/nums.length);
    }
}
