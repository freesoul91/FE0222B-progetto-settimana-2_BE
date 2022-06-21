package Blog;

public class Blog {

    //ATTRIBUTI
    private Articolo[] articoli;

    //COSTRUTTORE
    public Blog(Articolo[] articoli) {
        this.articoli = articoli;
    }

    //GETTER & SETTER
    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
    }

    //METODI
    public void stampaArticoloPerId(int id){
        for (int i =0; i < articoli.length; i++){
            if (articoli[i].getId() == id){
                System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitolo() + "\nData: " + articoli[i].getData() + "\nCategoria: " + articoli[i].getCategoria()  + "\nTesto: " + articoli[i].getTesto()+ "\nAutore: " + articoli[i].getAutore() + "\nTags: " + articoli[i].getTags());

            }
        }
    }

    public void stampaArticoli(){
        for (int i = 0; i < articoli.length; i++){
            System.out.println("\n -- Articolo " + (i+1) + " --" + "\nTitolo: " + articoli[i].getTitolo() + "\nData: " + articoli[i].getData() + "\nCategoria: " + articoli[i].getCategoria()  + "\nTesto: " + articoli[i].getTesto()+ "\nAutore: " + articoli[i].getAutore() + "\nTags: " + articoli[i].getTags() );
        }
    }
}
