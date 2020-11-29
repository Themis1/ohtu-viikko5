package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        sovellus.nollaa();
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        syotekentta.setText(Integer.toString(0));
        undo.disableProperty().set(false);
        nollaa.disableProperty().set(true);               
    }  

    @Override
    public void peru() {
        sovellus.edellinen();        
        // sovellus.miinus(Integer.parseInt(syotekentta.getText));
        tuloskentta.setText(Integer.toString(sovellus.tulos()));
        undo.disableProperty().set(true);
    }
}