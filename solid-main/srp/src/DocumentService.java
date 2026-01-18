// Classe responsable de la logique métier
public class DocumentService {

    public Document creerFacture(double montantHT, String clientName) {
        return new Document("FACTURE", montantHT, clientName, null);
    }

    public Document creerDevis(double montantHT) {
        return new Document("DEVIS", montantHT, null, "30 jours");
    }
}