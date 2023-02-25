package fr.iutmontpellier.tests;

import fr.iut.editeur.document.Document;
import junit.framework.TestCase;
import org.junit.Before;
public class DocumentTest extends TestCase {
    private Document doc;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        doc = new Document();
    }

    public void test_document_ajouter_texte_a_texte_vide() {
        doc.ajouter("Lorem");
        assertEquals("Lorem", doc.getTexte());
    }

    public void test_document_ajouter_texte_a_texte_deja_rempli() {
        doc.setTexte("Lorem");
        doc.ajouter(" ipsus");
        assertEquals("Lorem ipsuss", doc.getTexte());
    }

    public void test_document_clear_texte_quand_texte_vide() {
        doc.clear();
        assertTrue(doc.getTexte().isEmpty());
    }

    public void test_document_clear_texte_quand_texte_deja_rempli() {
        doc.setTexte("Lorem ipsus");
        doc.clear();
        assertTrue(doc.getTexte().isEmpty());
    }
}
