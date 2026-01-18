public class RemiseVIP implements Remise {
    @Override
    public double calculer(double montant) {
        return montant * 0.8; // 20% de remise pour les VIP
    }
}