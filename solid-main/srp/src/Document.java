import java.time.LocalDate;

// Classe représentant un document (Facture ou Devis)
public class Document {
    private String type;
    private double montantHT;
    private double tva;
    private double total;
    private String client;
    private LocalDate date;
    private String validite;

    public Document(String type, double montantHT, String client, String validite) {
        this.type = type;
        this.montantHT = montantHT;
        this.tva = montantHT * 0.2;
        this.total = montantHT + tva;
        this.client = client;
        this.date = LocalDate.now();
        this.validite = validite;
    }

    public String getType() {
        return type;
    }

    public double getMontantHT() {
        return montantHT;
    }

    public double getTva() {
        return tva;
    }

    public double getTotal() {
        return total;
    }

    public String getClient() {
        return client;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getValidite() {
        return validite;
    }

    @Override
    public String toString() {
        if ("FACTURE".equals(type)) {
            return String.format("FACTURE | %s | Client=%s | HT=%.2f | TVA=%.2f | TTC=%.2f\n",
                    date, client, montantHT, tva, total);
        } else {
            return String.format("DEVIS | %s | HT=%.2f | TVA=%.2f | TTC=%.2f | validite=%s\n",
                    date, montantHT, tva, total, validite);
        }
    }
}