import java.util.Arrays;

public class ZadTab {
    /**
     * stworzyć dwie tablice int { 5,6,12,1,-4}
     * znalezc min i max
     * metoda liczaca srednią
     * metoda znajdujaca mediane
     */

    public static void main(String[] args) {

        int[] tab1 = {-2, 2, 2, 2, 2};
        int[] tab2 = {1, 3, 4, 1, -4};

        System.out.println(averageNumber(tab1));//srednia
        System.out.println(maxArray(tab1));//maximum
        System.out.println(minArray(tab1));//minimum
        mediana(tab1);
    }

    public static double averageNumber(int[] tab) {
        double average = 0;
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        average = sum / tab.length;
        return average;
    }

    public static int maxArray(int a[]) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }
        return max;
    }

    public static int minArray(int a[]) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) min = a[i];
        }
        return min;
    }

    private static void mediana(int[] tab) {
        double mediana = 0;
        Arrays.sort(tab);
        if (tab.length % 2 == 0) {
            mediana = (tab[tab.length / 2] + tab[(tab.length / 2) + 1]) / 2.0;
        } else {
            mediana = tab[tab.length / 2];
        }
        System.out.println("Mediana liczb w tablicy to: " + mediana);
    }
}
