import java.util.List;

public class SurBatterie extends OptionsAppareil{
    public static float PRIX=20;

    public SurBatterie(Appareil appareil) {
        super(appareil);
    }

    public SurBatterie(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }

    @Override
    public void setOptions() {
        super.addPiece(new Piece("Batterie",PRIX));
    }
}
