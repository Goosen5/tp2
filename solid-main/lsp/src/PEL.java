public class PEL implements Compte {
    private final double tauxInteret = 0.03;
    private double solde = 100;

    @Override
    public double getSolde() {
        return solde;
    }

    public void calculerInteret() {
        solde += solde * tauxInteret;
    }
}