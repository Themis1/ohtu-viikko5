package laskin;

public class Sovelluslogiikka {
    private int tulos;

    public Sovelluslogiikka(){
        this.tulos = 0;
    }
    public void plus(int luku) {
        this.tulos += luku;
    }
    public void miinus(int luku) {
        this.tulos -= luku;
    }
    public void nollaa() {
        this.tulos = 0;
    }
    public int tulos() {
        return this.tulos;
    }
}



