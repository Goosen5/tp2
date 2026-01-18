public class RemiseFactory {
    public static Remise getRemise(int typeClient) {
        switch (typeClient) {
            case 1:
                return new RemiseStandard();
            case 2:
                return new RemiseEtudiant();
            case 3:
                return new RemiseVIP();
            default:
                throw new IllegalArgumentException("Type de client inconnu");
        }
    }
}