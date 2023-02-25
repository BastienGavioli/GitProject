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

    /**
     * Permet d'ajouter du texte à la fin de celui-ci s'il est déjà commencé
     * @param texte
     */
    public void ajouter(String texte) {
        this.texte += texte;
    }

    /**
     * Permet de remplacer la chaine de caractère située entre les index {@code start} et {@code end}.
     * @param start index de départ
     * @param end index de fin
     */
    public void remplacer(int start, int end, String remplacement) {
        String leftPart = this.texte.substring(0, start);
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + remplacement + rightPart;
    }

    /**
     * Permet de mettre en majuscule la chaine de caractère située entre les index {@code start} et {@code end}.
     * @param start index de départ
     * @param end index de fin
     */
    public void majuscules(int start, int end) {
        String leftPart = this.texte.substring(0, start);
        String upperText = this.texte.substring(start, end).toUpperCase(new Locale("fr", "FR"));
        String rightPart = this.texte.substring(end);
        this.texte = leftPart + upperText + rightPart;
    }

    /**
     * Permet d'effacer la chaine de caractère située entre les index {@code start} et {@code end}.
     * @param start index de départ
     * @param end index de fin
     */
    public void effacer(int start, int end) {
        remplacer(start, end, "");
    }

    /**
     * Efface tout le contenu du texte
     */
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
