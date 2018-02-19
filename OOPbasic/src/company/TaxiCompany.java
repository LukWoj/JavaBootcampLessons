package company;
/**
 * Napisać aplikację zarządzającą zamówieniami taksówek.
 * Firma ma kilka taksówek. Potrzebuje aplikacji do zamawiania taksówek i
 * wysyłania wolnej taksówki do klienta.
 * Taksówki powinny być widoczne w aplikacji poprzez:
 * - identyfikator
 * - imię i nazwisko kierowcy
 * - markę samochodu
 * Użytkownik aplikacji odbiera zgłoszenie, wpisuje nazwisko klienta
 * i jego współrzędne geograficzne. Aplikacja dla takich danych powinna
 * wyświetlić jeden z dwóch komunikatów:
 * - dane wolnej taksówki (od teraz ta taksówka będzie zajęta)
 * - powiadomić, że wszystkie taksówki zajęte.
 * Rozwinięcie: wprowadzić współrzędne geograficzne każdej taksówki.
 * Zmienić algorytm szukający wolnej taksówki w taki sposób by znajdywał
 * najbliższą wolną taksówkę dla podnych współrzędnych.
 * Rozwinięcie: dodać możliwość wyświetlenia danych szczegółowych
 * dla trzech najbliższych taksówek i możliwość zamówienia jednej z nich.
 * Rozwinięcie: dodać możliwość wyszukania taksówek po opisie.
 * Do opisu można wprowadzić identyfikator lub imię lub nazwisko
 * lub markę samochodu.
 * Wyświetlają nam się wszystkie taksówki spełniające
 * wprowadzony opis z możliwością zamówienie jednej z nich.
 */
public class TaxiCompany {          //klasa manager

    private Taxi[] taxiTable;

    public TaxiCompany(Taxi[] taxiTable) {
        this.taxiTable = taxiTable;
    }

    public String taxiAvailable() {
        for (Taxi taxi : taxiTable) {
            if (taxi.isAvailable()) {
                taxi.bookTaxi();
                return taxi.toString();
            }
        }
        return "Sorry all taxi are booked";
    }

    public int countAvailableTaxi() {
        int count = 0;
        for (Taxi taxi : taxiTable) {
            if (taxi.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}

