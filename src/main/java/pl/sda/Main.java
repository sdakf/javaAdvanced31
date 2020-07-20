package pl.sda;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("A4");
        System.out.println(car); //domyślnie na obiekcie wywoła się toString()
        System.out.println(car.getModel()); // można wywołać po prostu get
    }
}
