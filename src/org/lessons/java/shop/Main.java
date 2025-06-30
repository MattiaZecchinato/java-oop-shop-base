package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {
        Prodotto monopolyGame = new Prodotto("Monopoly", "Lorem ipsum dolor sit amet consectetur adipiscing elit.",
                16.00f,
                20f);

        System.out.println(monopolyGame.getPrice());
        System.out.println(monopolyGame.getPriceWithIva());
        System.out.println(monopolyGame.getExtendName());

        Prodotto xboxController = new Prodotto("Xbox Controller",
                "Lorem ipsum dolor sit amet consectetur adipiscing elit. Quisque faucibus ex sapien vitae pellentesque sem placerat.",
                50f,
                25f);

        System.out.println(xboxController.getPrice());
        System.out.println(xboxController.getPriceWithIva());
        System.out.println(xboxController.getExtendName());

        Prodotto newProduct = new Prodotto();

        System.out.println(newProduct.getExtendName());
        newProduct.setName("Prodotto 1");
        System.out.println(newProduct.getName());
    }
}
