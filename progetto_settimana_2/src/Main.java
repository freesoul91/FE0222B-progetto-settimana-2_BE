import Blog.Articolo;
import Blog.Autore;
import Blog.Blog;
import Blog.SottoClassi.ArticoloFantasy;
import Blog.SottoClassi.ArticoloNoir;
import Blog.Tags;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /** TAGS **/
        String[] tagOroscopo = {"mese", "giugno", "amore", "fortuna"};
        String[] tagPolitica = {"elezioni", "francia", "macron", "lepen"};
        String[] tagFantasy = {"magia", "fantasy", "finalfantasyX", "game"};
        String[] tagNoir = {"giallo", "assassinio", "thriller", "investigativo"};
        Tags tagsOroscopo = new Tags(tagOroscopo);
        Tags tagsPolitica = new Tags(tagPolitica);
        Tags tagsFantasy = new Tags(tagFantasy);
        Tags tagsNoir = new Tags(tagNoir);

        /** AUTORI **/
        Autore nobuoUematsu = new Autore(1,"Nobuo","Uematsu");
        Autore agathaChristie = new Autore(2,"Agatha","Christie");
        Autore paoloFox = new Autore(3,"Paolo","Fox");
        Autore marcoTravaglio = new Autore(4,"Marco","Travaglio");


        /** ARTICOLI **/
        Articolo OroscopoGiugno = new Articolo(1,"Oroscopo del mese ", LocalDate.of(2022,06,1),"Oroscopo","Si respira già aria di estate e quale miglior modo per sapere come andrà se non quello di leggere le previsioni estive di Paolo Fox tratte dal suo libro?",tagsOroscopo);
        Articolo ElezioniFrancia = new Articolo(2,"Emmanuel Macron tracollo alle elezioni francesi. ", LocalDate.of(2022,6,20),"Politica","Il presidente francese perde la maggioranza assoluta. La sinistra di Nupes è seconda. Exploit della leader della destra", tagsPolitica);
        Articolo FinalFantasyX = new sottoclassi.ArticoloFantasy(3,"Final Fantasy X è l'ultimo vero capolavoro Square Enix?", LocalDate.of(2021,7,22),"Fantasy","Final Fantasy X è anche il migliore? Probabilmente, ma se la serie non è stata più all'altezza del suo passato è anche colpa di Tidus e compagnia viaggiante.",nobuoUematsu, tagsFantasy);
        Articolo Lassassinio = new sottoclassi.ArticoloNoir(4,"Il piu bel giallo di sempre", LocalDate.of(1991,4,20),"Giallo","Il caso orient express", agathaChristie, tagsNoir);

        OroscopoGiugno.setAutore(paoloFox);
        ElezioniFrancia.setAutore(marcoTravaglio);

        Articolo[] articoliBlog = {OroscopoGiugno, ElezioniFrancia, FinalFantasyX,Lassassinio};


        /** BLOG **/
        Blog blog = new Blog(articoliBlog);

        executeBlog(blog);

    }

    public static void executeBlog(Blog blog){
        System.out.println("\nBenvenuto nel nostro Blog!\nOpzioni disponili : \n-Vedere tutti gli Articoli (premi '1') \n-Effettuare una ricerca tramite ID(premi '2')");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        switch (x){

            case 1: blog.stampaArticoli();
                break;

            case 2: System.out.println("Selezione l'ID del tuo Articolo: "); int y = scanner.nextInt(); if(y > blog.getArticoli().length || y <= 0){ System.out.println("Articolo inesistente!"); }
            else{
                blog.stampaArticoloPerId(y);
            }
                break;

            default: System.out.println("Opzione non valida!");
        }
    }
}
