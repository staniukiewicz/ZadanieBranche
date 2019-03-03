public class Pracownik {

    String imie;
    String nazwisko;
    Double pesel;
    int wiek;
    int zarobki;

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Double getPesel() {
        return pesel;
    }

    public void setPesel(Double pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public Pracownik(String imie, String nazwisko, Double pesel, int wiek, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }
}
