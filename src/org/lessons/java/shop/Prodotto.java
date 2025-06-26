package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    int code;
    String name;
    String description;
    float price;
    float iva;

    Random randNum = new Random();

    public Prodotto(String name, String description, float price, float iva) {
        this.code = randNum.nextInt(100);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public float getPrice() {
        System.out.println(this.price);
        return this.price;
    }

    public float getPriceWithIva() {
        float calcIva = this.price * (this.iva / 100);
        float finalPrice = this.price + calcIva;

        System.out.println(finalPrice);
        return finalPrice;
    }

    public String getExtendName() {

        String extendedName = this.code + "-" + this.name;

        System.out.println(extendedName);
        return extendedName;
    }
}
