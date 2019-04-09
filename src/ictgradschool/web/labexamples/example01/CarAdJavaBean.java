package ictgradschool.web.labexamples.example01;

import java.io.Serializable;

public class CarAdJavaBean implements Serializable {

    private String carModel = null;
    private int carPrice = 0;
    private String description = null;

    public CarAdJavaBean() {
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
