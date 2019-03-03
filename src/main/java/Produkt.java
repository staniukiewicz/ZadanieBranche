public class Produkt {
    String nazwa;
    Double cenaNetto;
    Double podatekVAT;

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cenaNetto=" + cenaNetto +
                ", podatekVAT=" + podatekVAT +
                '}';
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Double getCenaNetto() {
        return cenaNetto;
    }

    public void setCenaNetto(Double cenaNetto) {
        this.cenaNetto = cenaNetto;
    }

    public Double getPodatekVAT() {
        return podatekVAT;
    }

    public void setPodatekVAT(Double podatekVAT) {
        this.podatekVAT = podatekVAT;
    }

    public Produkt(String nazwa, Double cenaNetto, Double podatekVAT) {
        this.nazwa = nazwa;
        this.cenaNetto = cenaNetto;
        this.podatekVAT = podatekVAT;
    }
}
