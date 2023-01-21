package ru.netology;

public class Smartphone extends Product {
    private String title;
    private String manufacturer;

    public Smartphone(int id, String title, int cost, String manufacturer, String name ) {
        super(id, title, cost, manufacturer);
        this.manufacturer = manufacturer;
        this.name = name;
    }

    public String getManufacturer() {

        return manufacturer;
    }
}
