import java.util.ArrayList;
import java.util.List;

public class Appareil {
    private String nom;
    private List<Piece> lesPieces= new ArrayList<>();

    public Appareil(String nom, List<Piece> lesPieces){
        this.nom=nom;
        this.lesPieces=lesPieces;
    }
    public float getPrix(){
        float res=0;
        for (Piece a:lesPieces) {
            res+=a.getPrix();
        }
        return res;
    }
    public void add(Piece piece){
        lesPieces.add(piece);
    }
    public void remove(Piece piece){
        lesPieces.remove(piece);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Piece> getLesPieces() {
        return lesPieces;
    }

    public void addPiece(Piece unePiece){
        lesPieces.add(unePiece);
    }

    public void setLesPieces(List<Piece> lesPieces) {
        this.lesPieces = lesPieces;
    }
}
