public class Car extends Vehicle {
    public Car(){

    }

    public String start() {
        return "A " + super.getCar() + " has started!\n";
    }
    public String accelerate(){
        return "The " + super.getCar() + " is accelerating\n";
    }
    public String speeding(){
        return "The " + super.getCar() + " is going " + super.getSpeed() + " mph\n";
    }
    public String stop(){
        return "The " + super.getCar() + " is stopped";
    }
    public String sentence(){
        return start() + accelerate() + speeding() + stop() + "\n";
    }

}

