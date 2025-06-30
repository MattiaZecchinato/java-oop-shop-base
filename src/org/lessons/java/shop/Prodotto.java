package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private float price;
    private float iva;

    Random randNum = new Random();

    public Prodotto() {
        this.code = randNum.nextInt(100);
        this.name = "";
        this.description = "";
        this.price = 0f;
        this.iva = 0f;
    }

    public Prodotto(String name, String description, float price, float iva) {
        this.code = randNum.nextInt(100);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public int getCode() {
        return this.code;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    public void setDescription(String description) {
        if (description != null) {
            this.description = description;
        }
    }

    public String getDescription() {
        return this.description;
    }

    public void setPrice(float price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public float getPrice() {
        return this.price;
    }

    public void setIva(float iva) {
        if (iva >= 0) {
            this.iva = iva;
        }
    }

    public float getIva() {
        return this.iva;
    }

    public float getPriceWithIva() {
        float calcIva = this.price * (this.iva / 100);

        return this.price + calcIva;
    }

    public String getExtendName() {
        return this.code + "-" + this.name;
    }
}
