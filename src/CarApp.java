import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {
    public static void main(String[] args){
        ArrayList<Car> cars = new ArrayList<>();
        Scanner kybd = new Scanner(System.in);

        Car car1 = new Car();
        Car car2 = new Car();
        Car userCar = new Car();

        car1.setColor("Red");
        car1.setCar("Tesla");
        car1.setSpeed(90);

        car2.setColor("Blue");
        car2.setCar("Porsche");
        car2.setSpeed(50);

//        print(car1.sentence());
//        print(car2.sentence());

        cars.add(car1);
        cars.add(car2);

        System.out.println("Enter car name: ");
        userCar.setCar(kybd.next());

        System.out.println("Enter cars color: ");
        userCar.setColor(kybd.next());

        System.out.println("Enter cars speed: ");
        userCar.setSpeed(kybd.nextInt());

        cars.add(userCar);

        for(Car car: cars){
            System.out.println(car.sentence());
        }

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
