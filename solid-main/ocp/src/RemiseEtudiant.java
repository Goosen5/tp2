public class RemiseEtudiant implements Remise {
    @Override
    public double calculer(double montant) {
        return montant * 0.9; // 10% de remise pour les étudiants
    }
}