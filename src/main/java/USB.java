import java.util.List;

public class USB extends OptionsAppareil{
    public static float PRIX=10;

    public USB(Appareil appareil) {
        super(appareil);
    }

    public USB(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }
    @Override
    public void setOptions() {
        super.addPiece(new Piece("USB",PRIX));
    }
}
