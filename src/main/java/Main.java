public class Main {
    public static void main(String[] args) {
        AppareilFactory Factory= new AppareilFactory();
        Appareil machine=Factory.creerAppareil("machineALaver");
        System.out.println(machine.getNom()+" "+machine.getLesPieces()+" "+machine.getPrix());

        Appareil brosse=Factory.creerAppareil("brosseADents");
        System.out.println(brosse.getNom()+" "+brosse.getLesPieces()+" "+brosse.getPrix());


    }
}
