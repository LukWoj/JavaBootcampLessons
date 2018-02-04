public class ProductApp {
    /**
     * Stwórz klase Product zawierajaca(price,name)
     * Stworz dwie tablice przechowujace obiekty typu product
     * Znalezc najtanszy produkt w obydwu tablicach
     */
    public static void main(String[] args) {

        Product[] prod1 = {new Product(60, "kapusta"),
                new Product(10, "banany"),
                new Product(20, "truskawki"),
                new Product(100, "czeresnie"),
                new Product(110, "ogorki")};
        Product[] prod2 = {new Product(50, "pendrive"),
                new Product(1, "latarka"),
                new Product(20, "słuchawki"),
                new Product(100, "radio"),
                new Product(110, "żelazko")};

        System.out.println("Najtanszy produkt:--> " + findCheapest(prod1));
        System.out.println("Najtanszy produkt:--> " + findCheapest(prod2));
    }

    public static Product findCheapest(Product[] prodTab) {
        int min = prodTab[0].getPrice();
        int minIndex = 0;
        for (int i = 0; i < prodTab.length; i++) {
            if (prodTab[i].getPrice() < min) {
                min = prodTab[i].getPrice();
                minIndex = i;
            }
        }
        return prodTab[minIndex];
    }
}


