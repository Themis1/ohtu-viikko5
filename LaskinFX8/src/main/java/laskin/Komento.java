package laskin;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.util.HashMap;
import java.util.Map;

public abstract class Komento {
    protected TextField tuloskentta; 
    protected TextField syotekentta; 
    protected Button plus;
    protected Button miinus;
    protected Button nollaa;    
    protected Sovelluslogiikka sovellus;   
    protected Button undo; 

    public Komento(TextField tuloskentta, TextField syotekentta, Button nollaa, Button undo, Sovelluslogiikka sovellus){ 
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.plus = plus;
        this.miinus = miinus;
        this.nollaa = nollaa;    
        this.sovellus = new Sovelluslogiikka();
    }
    public abstract void suorita();
    public abstract void peru();
}
