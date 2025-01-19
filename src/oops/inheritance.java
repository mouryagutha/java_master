package oops;
class Vechicle{
    String type;

    void showtype(){
        System.out.println("vehicle type:" + type);
    }
}

class Bike extends Vechicle{
    int maxspeed;
    void showdetails(){
        System.out.println("Max speed:" + maxspeed + "km/h");
    }
}

class Inheritance {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.type = "two-Wheeler";
        bike.maxspeed = 150;
        bike.showtype();
        bike.showdetails();
    }
}
