package lab05.z2;

import java.time.LocalDate;

class Budynek {
    String nazwa;
    int rokBudowy;
    int liczbaPieter;

    public Budynek(String nazwa, int rokBudowy, int liczbaPieter) {
        this.nazwa = nazwa;
        this.rokBudowy = rokBudowy;
        this.liczbaPieter = liczbaPieter;
    }

    int obliczWiek() {
        return LocalDate.now().minusYears(rokBudowy).getYear();
    }

    void wypisz() {
        System.out.println("Budynek o nazwie \"" + nazwa + "\" wybudowany w " + rokBudowy + " roku, więc ma " + obliczWiek() + " lat. Ma " + liczbaPieter + " pieter. ");
    }
}
