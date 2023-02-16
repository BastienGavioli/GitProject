package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public abstract class CommandeDocument implements Commande {

    protected Document document;

    protected String[]parameters;

    protected static String textBeforeUpdate;
    protected static String textAfterUpdate;

    public CommandeDocument(Document document, String[] parameters) {
        this.document = document;
        this.parameters = parameters;
        textBeforeUpdate = CommandeDocument.getTextBeforeUpdate();
        textAfterUpdate = CommandeDocument.getTextAfterUpdate();
    }

    @Override
    public void executer() {
        System.out.println(this.document);
    }

    public void commit() {
        if (document.getTexte().isEmpty()) textBeforeUpdate = "";
        else textBeforeUpdate = document.getTexte();
    }
    public void commitAfter() {
        if (document.getTexte().isEmpty()) textAfterUpdate = "";
        else textAfterUpdate = document.getTexte();
    }

    public static String getTextBeforeUpdate() {
        if (textBeforeUpdate != null) return textBeforeUpdate;
        return "";
    }

    public static String getTextAfterUpdate() {
        if (textAfterUpdate != null) return textAfterUpdate;
        return "";
    }

}
