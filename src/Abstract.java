abstract class vehicle {
    abstract void start();
   // abstract  void  horn();
    void stop(){
        System.out.println("Stop using key");
    }
}

class car extends vehicle {
    void start() {
        System.out.println("Car Starts with key.");
    }
   /* void horn(){

    }*/
}

class bike extends vehicle {
    void start() {
        System.out.println("Bike Starts with kick.");
    }
    /*void horn(){

    }*/
}

public class Abstract {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        bike b = new bike();
        b.start();
        b.stop();
    }
}
