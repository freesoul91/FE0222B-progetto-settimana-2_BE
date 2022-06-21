package sottoclassi;
import Blog.Articolo;

import Blog.Autore;
import Blog.Tags;

import java.time.LocalDate;

public class ArticoloNoir extends Articolo {

    //ATTRIBUTI
    private String descrizione;

    //COSTRUTTORE

    public ArticoloNoir(int id, String titolo, LocalDate data, String categoria, String testo, Autore autore, Tags tags) {
        super(id, titolo, data, categoria, testo, autore, tags);
        this.setDescrizione(descrizione);
    }

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
