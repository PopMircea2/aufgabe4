public class Shop {
    public int minTastatur(int[] tastaturen) {
        int min = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < min) {
                min = tastaturen[i];
            }
        }
        return min;
    }
    public int maxPreis(int[] tastaturen, int[] usbs) {
        int max = tastaturen[0];
        for (int preis : tastaturen) {
            if (preis > max) {
                max = preis;
            }
        }
        for (int preis : usbs) {
            if (preis > max) {
                max = preis;
            }
        }
        return max;
    }
    public int teuersteUSB(int[] usbs, int budget) {
        int max = -1;
        for (int preis : usbs) {
            if (preis > max && preis <= budget) {
                max = preis;
            }
        }
        return max;
    }
    public int maximaleKosten(int[] tastaturen, int[] usbs, int budget) {
        int maxKosten = -1;
        for (int tastaturPreis : tastaturen) {
            for (int usbPreis : usbs) {
                int gesamtPreis = tastaturPreis + usbPreis;
                if (gesamtPreis <= budget && gesamtPreis > maxKosten) {
                    maxKosten = gesamtPreis;
                }
            }
        }
        return maxKosten;
    }
}
