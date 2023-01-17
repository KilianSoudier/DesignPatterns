import java.util.ArrayList;
import java.util.List;

public class AppareilFactory {
    public static String QUENOTTE3000;
    public static String LAVETOU;

    public Appareil creerAppareil(String nom){
        Appareil a;
        List<Piece> lesPieces = new ArrayList<>();

        switch(nom){
            case "machineALaver":
                lesPieces.add(new Piece("moteur 2000", 200));
                lesPieces.add(new Piece("tambour prenium", 100));
                a= new Appareil("lavetou",lesPieces);
                SurSecteur option= new SurSecteur(a);
                option.setOptions();

                break;
            case "brosseADents":
                lesPieces.add(new Piece("Brosse", 5));
                lesPieces.add(new Piece("Manche", 3));
                lesPieces.add(new Piece("Cable", 3));
                lesPieces.add(new Piece("Batterie", 50));
                lesPieces.add(new Piece("Coque", 2));
                a = new Appareil("Quenottes3000",lesPieces);

                Induction optionAP= new Induction(a);
                optionAP.setOptions();
                SurBatterie sb = new SurBatterie(a);
                sb.setOptions();
                USB usb = new USB(a);
                usb.setOptions();

                break;
            default:
                a = new Appareil("appareil inconnu",null);
                break;
        }

        return a;
    }
}
