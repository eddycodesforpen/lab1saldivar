/**
 * Edward saldivar project.
 /**

 * Project:Motorcycle
 * Purpose Details: make 3 MotorCycles
 * Course:IST 242
 * Author:Edward
 * Date Developed:01/23/2025
 * Last Date Changed:01/24/25
 * Revision:now */;
public class Main {
    public static void main(String[] args) {
        Motorcycle myCycle = new Motorcycle("white", 80.9, Material.Ti, 55.3);
        myCycle.setColor("Orange");
        myCycle.setSize(80.9);
        Motorcycle myCycle2 = new Motorcycle("Rainbow", 95, Material.CARBON_FIBER, 130);
        myCycle2.setColor("Orange");
        Motorcycle myCycle3 = new Motorcycle("Titanum Black", 86, Material.ALUMINUM, 180);

        Engine myEng = new Engine("998","200");
        System.out.println(myEng.getCC());
        Engine myEng2 = new Engine("883","150");
        System.out.println(myEng2.getCC());
        Engine myEng3 = new Engine("1923","107");
        System.out.println(myEng3.getCC());



        System.out.println("Bike color: " + myCycle.getColor());
        System.out.println("Bike size: " + myCycle.getSize());
        System.out.println("Frame material: " + myCycle.getFrameMaterial());
        System.out.println("Wheel size: " + myCycle.getWheelSize());
        myCycle.start();
        myCycle.stop();

        System.out.println("Bike color: " + myCycle2.getColor());
        System.out.println("Bike size: " + myCycle2.getSize());
        System.out.println("Frame material: " + myCycle2.getFrameMaterial());
        System.out.println("Wheel size: " + myCycle2.getWheelSize());
        myCycle2.start();
        myCycle2.stop();

        System.out.println("Bike color: " + myCycle3.getColor());
        System.out.println("Bike size: " + myCycle3.getSize());
        System.out.println("Frame material: " + myCycle3.getFrameMaterial());
        System.out.println("Wheel size: " + myCycle3.getWheelSize());
        myCycle3.start();
        myCycle3.stop();
    }
}
