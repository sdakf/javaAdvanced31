package pl.sda;

import java.util.Objects;

public class Car extends Object { //nadklasa -> matka wszystkich klas (Object)

    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override //przedefiniowanie metody
    public String toString() {
        return "Samochód: " + model;
    }
}
