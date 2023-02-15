package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument{

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        if(parameters.length < 3) {
            System.err.println("Format attendu : remplacer;indexDébut;indexFin;remplacement");
            return;
        }
        int start = Integer.parseInt(parameters[1]);
        int end = Integer.parseInt(parameters[2]);
        String replacement;
        if (parameters.length == 3) replacement = "";
        else replacement = parameters[3];
        this.document.remplacer(start, end, replacement);
        super.executer();
    }
}
