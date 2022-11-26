public class Car {

    final private String name;
    final private String color;
    final private int wheels;

    public Car(String name, String color, int wheels) {
        this.name = name;
        this.color = color;
        this.wheels = wheels;
    }

    public void printCarName(){
        System.out.println("Our car name is + " + name);
    }
}
