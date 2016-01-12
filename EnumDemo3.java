//use an enum ctor, instance variable, and method
enum Transport{
    CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

    private int speed;
    Transport(int s) { speed = s;} //ctor
    int getSpeed() { return speed;} //method

}

class EnumDemo3 {
    public static void main(String args[]) {
        Transport tp;

        //display speed of AIRPLANE
        System.out.println("Typical speed of an airplane is: " +
                Transport.AIRPLANE.getSpeed() + 
                " miles per hour\n");

        //display all transports and speed
        System.out.println("All transport speeds: ");
        for(Transport t : Transport.values()) {
            System.out.println(t + " typical speed is " +
                    t.getSpeed() + " miles per hour");
        }
    }
}
