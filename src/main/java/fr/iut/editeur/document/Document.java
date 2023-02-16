package fr.iut.editeur.document;

import java.util.Locale;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String upperText = this.texte.substring(start, end).toUpperCase(new Locale("fr", "FR"));
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + upperText + rightPart;
    }

    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    public void clear() {
        this.texte = "";
    }

    public void inserer(int index, String texte) {
        remplacer(index, index, texte);
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
