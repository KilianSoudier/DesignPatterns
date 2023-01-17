import java.util.List;

public class SurSecteur extends OptionsAppareil{

    public static float PRIX=5;

    public SurSecteur(Appareil appareil) {
        super(appareil);
    }

    public SurSecteur(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }
    @Override
    public void setOptions() {
        super.addPiece(new Piece("Sur Secteur",PRIX));
    }
}
