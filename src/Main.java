public class Main {
    public static void main(String[] args) {

        Shop shopper = new Shop();
        int[] keyboards = {40, 50, 60};
        int[] usbs = {8, 12};
        int budget = 60;
        System.out.println("Billigste tastatur: " + shopper.minTastatur(keyboards));
        System.out.println("teuresten gegenstand: " +shopper.maxPreis(keyboards, usbs));
        System.out.println("teuerste usb unter buget: " + shopper.teuersteUSB(usbs, budget));
        System.out.println("maximalen geldbetrag: " + shopper.maximaleKosten(keyboards, usbs, budget));

    }
}