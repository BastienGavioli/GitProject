package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRedo extends CommandeDocument{
    public CommandeRedo(Document document, String[] parameters) {
        super(document, parameters);
    }

    @Override
    public void executer() {
        String textAfterUpdate = getTextAfterUpdate();
        commit();
        document.setTexte(textAfterUpdate);
        super.executer();
    }
}
