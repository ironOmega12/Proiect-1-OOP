import java.util.Scanner;

public class CatalogMasini {
    public static void main(String[] args) {
        Masini[] masina = new Masini[10];
        Scanner sc = new Scanner(System.in);
        int optiune;
        do{
            System.out.println("--------------Meniu-----------"); // comm
            System.out.println("1.Introducere masini noi");
            System.out.println("2.Cautare masini");
            System.out.println("3.Afisare nr total masini");
            System.out.println("4.Iesire");
            optiune = sc.nextInt();

            switch (optiune) {
                case 1:
                    int nrMasini;
                    System.out.println("Cate masini doriti sa adaugati?");
                    nrMasini = sc.nextInt();
                    for (int i = 0; i < nrMasini; i++) {
                        System.out.println("Introduceti marca masinii");
                        String marca = sc.next();
                        System.out.println("Introduceti modelul masinii");
                        String model = sc.next();
                        System.out.println("Introduceti nr sasiu");
                        String sasiu = sc.next();
                        System.out.println("Introduceti nr km");
                        int km = sc.nextInt();
                        masina[i] = new Masini(marca, model, sasiu, km);
                    }
                    break;
                case 2:
                    String sasiuCautat;
                    System.out.println("Introduceti sasiul masinii pe care o cautati: ");
                    sasiuCautat = sc.next();
                    boolean masinaGasita = false;
                    for (int i = 0; i < masina.length; i++) {
                        if (masina[i] != null && sasiuCautat.equals(masina[i].getSasiu())) {
                            System.out.println("Masina exista: " + masina[i].getMarca() + " " + masina[i].getModel());
                            masinaGasita = true;
                            break;
                        }
                    }
                    if (!masinaGasita) {
                         System.out.println("Masina nu exista in catalog");
                    }
                    break;
                case 3:
                    System.out.println("Nr total de masini: " + Masini.getNumarMasini());
            }
        } while (optiune != 4);

        sc.close();
    }
}
