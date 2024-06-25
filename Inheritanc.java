import java.util.Scanner;

class Vehicle {
    double d, t;

    Vehicle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance: ");
        d = sc.nextDouble();
        System.out.print("Enter time: ");
        t = sc.nextDouble();
    }
}

class Car extends Vehicle {
    void speed() {
        System.out.println("Speed: " + (d / t));
    }
}

public class Inheritanc {
    public static void main(String[] args) {
        Car c = new Car();
        c.speed();
    }
}






/*
 OUTPUT:
 []
 */