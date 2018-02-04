public class Library {

    /**
     *
     */
    private static final int INITIAL_CAPACITY = 5;

    private Book[] books;
    private boolean[] bookStatus;

    public Library() {
        books = new Book[INITIAL_CAPACITY];
        books[0] = new Book("Henryk Sienkiewicz", "Potop");
        books[1] = new Book("Henryk Sienkiewicz", "Krzyżacy");
        books[2] = new Book("Henryk Sienkiewicz", "Latarnik");
        books[3] = new Book("Henryk Sienkiewicz", "Quo Vadis");
        books[4] = new Book("Henryk Sienkiewicz", "Ogniem i mieczem");

        bookStatus = new boolean[INITIAL_CAPACITY];
        bookStatus[0] = true;// default is availlable
        bookStatus[1] = true;
        bookStatus[2] = true;
        bookStatus[3] = true;
        bookStatus[4] = true;
    }

    public boolean isAvaillable(String title) {//false - is unavaillable
        //true - is availlable
        for (int i = 0; i < books.length; i++) {
            if (((books[i].getTitle()).equals(title)) && bookStatus[i] == false) {
                return false;
            }
        }
        return true;
    }

    public void borrowBook(String title) {
        for (int i = 0; i < books.length; i++) {
            if ((books[i].getTitle().equals(title))) {
                bookStatus[i] = false;
            }
        }
    }
}
