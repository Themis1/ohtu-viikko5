package laskin;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Nollaa extends Komento {
    private Sovelluslogiikka sovellus;
    private TextField tuloskentta;
    private TextField syotekentta;
    private Button undo;
    private Button nollaa;    

    public Nollaa(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus) {
        //super(tuloskentta, syotekentta, plus, miinus, nollaa, undo);
        super(tuloskentta, syotekentta, nollaa, undo, sovellus);
    }

    @Override
    public void suorita() {
        tuloskentta.setText("0");
    }  

    @Override
    public void peru() {
        return;
    }
}