package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        //super(tuloskentta, syotekentta, plus, miinus, nollaa, undo);
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tuloskentta.setText("" + sovellus.tulos());
    }  

    @Override
    public void peru() {
        return;
    }
}