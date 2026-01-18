public class RemiseStandard implements Remise {
    @Override
    public double calculer(double montant) {
        return montant; // Pas de remise pour les clients standards
    }
}