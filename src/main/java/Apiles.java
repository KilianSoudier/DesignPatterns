import java.util.List;

public class Apiles extends OptionsAppareil{
    public static float PRIX=5;

    public Apiles(Appareil appareil) {
        super(appareil);
    }

    public Apiles(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }

    @Override
    public void setOptions() {
        super.addPiece(new Piece("Piles",PRIX));
    }
}
