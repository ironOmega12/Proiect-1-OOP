import java.util.Scanner;

public class CatalogMasini {
    public static void main(String[] args) {
        Masini[] masina = new Masini[10];   // Tabloul care stocheaza masinile
        Scanner sc = new Scanner(System.in);
        int optiune; // Crearea unei optiuni pe care o vom citi de la tastatura
        do{
            System.out.println("--------------Meniu-----------"); // Meniul folosind do-while
            System.out.println("1.Introducere masini noi");
            System.out.println("2.Cautare masini");
            System.out.println("3.Afisare nr total masini");
            System.out.println("4.Iesire");
            optiune = sc.nextInt(); // Optiunea utilizatorului

            switch (optiune) {
                case 1:
                    int nrMasini;
                    System.out.println("Cate masini doriti sa adaugati?"); // Citim numarul de masini care urmeaza sa fie stocate
                    nrMasini = sc.nextInt();
                    for (int i = 0; i < nrMasini; i++) { // Introducem detaliile masinii
                        System.out.println("Introduceti marca masinii");
                        String marca = sc.next();
                        System.out.println("Introduceti modelul masinii");
                        String model = sc.next();
                        System.out.println("Introduceti nr sasiu");
                        String sasiu = sc.next();
                        System.out.println("Introduceti nr km");
                        int km = sc.nextInt();
                        masina[i] = new Masini(marca, model, sasiu, km); // Crearea obiectului masina si stocarea in tablou
                    }
                    break;
                case 2:
                    String sasiuCautat;
                    System.out.println("Introduceti sasiul masinii pe care o cautati: "); // Introducerea numarului de sasiu cautat
                    sasiuCautat = sc.next();
                    boolean masinaGasita = false;
                    for (int i = 0; i < masina.length; i++) {
                        if (masina[i] != null && sasiuCautat.equals(masina[i].getSasiu())) { // Cautarea masinii
                            System.out.println("Masina exista: " + masina[i].getMarca() + " " + masina[i].getModel());
                            masinaGasita = true;
                            break;
                        }
                    }
                    if (!masinaGasita) {
                         System.out.println("Masina nu exista in catalog"); // Daca nu a fost gasita, afisam mesajul
                    }
                    break;
                case 3:
                    System.out.println("Nr total de masini: " + Masini.getNumarMasini()); // Afisam numarul total de masini
            }
        } while (optiune != 4);

        sc.close();
    }
}
