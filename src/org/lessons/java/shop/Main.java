package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto monopolyGame = new Prodotto("Monopoly", "Lorem ipsum dolor sit amet consectetur adipiscing elit.",
                16.00f,
                20f);

        monopolyGame.getPrice();
        monopolyGame.getPriceWithIva();
        monopolyGame.getExtendName();

        Prodotto xboxController = new Prodotto("Xbox Controller",
                "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat.",
                50f,
                25f);

        xboxController.getPrice();
        xboxController.getPriceWithIva();
        xboxController.getExtendName();
    }
}
