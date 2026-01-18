public abstract class CompteAvecRetrait implements Compte {
    protected double solde = 100;

    public double getSolde() {
        return solde;
    }

    public abstract void retirer(double montant);
}