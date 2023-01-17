import java.util.List;

public class OptionsAppareil extends Appareil{
    private Appareil appareil;
    public OptionsAppareil(Appareil appareil){
        super(appareil.getNom(), appareil.getLesPieces());
    }
    public OptionsAppareil(String nom, List<Piece> lesPieces) {
        super(nom, lesPieces);
    }

    public void setOptions(){};// Surcharger cette fonction
}
