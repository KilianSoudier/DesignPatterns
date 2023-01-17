import java.util.List;

public class Induction extends OptionsAppareil{
    public static float PRIX=30;

    public Induction(Appareil appareil) {
        super(appareil);
    }

    public Induction(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }

    @Override
    public void setOptions() {
        super.addPiece(new Piece("Induction",PRIX));
    }
}
