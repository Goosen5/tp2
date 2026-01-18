// Classe responsable de la persistance des documents
import java.io.FileWriter;
import java.io.IOException;

public class DocumentRepository {

    public void sauvegarderDocument(Document document) {
        String fileName = document.getType().equals("FACTURE") ? "factures.txt" : "devis.txt";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(document.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}