import java.util.InputMismatchException;
import java.util.Scanner;

void main() {
    MathClass maths = new MathClass();
    Scanner input = new Scanner(System.in);
    boolean isReload = false;
    ExClass ex = new ExClass();
    CarEx car = new CarEx("Alfa Romeo", "33 Stradale", 2023);

        try {
            int chose = 0;

            System.out.println("Che esercizio vuoi Selezionare: ");
            System.out.println("1) Tabellina ");
            System.out.println("2) Multipli ");
            System.out.println("3) StampaMatrici ");
            System.out.println("4) Min & Max ");
            System.out.println("5) Modello Macchina ");
            System.out.println("6) Massimo in Lista ");
            System.out.println("7) Matrice 3x3 in Somma");
            System.out.println("8) Lista in Ricerca");
            System.out.println("9) Somma ASCII");  // Esercizio Fondamentale
            System.out.println("10) Ordinamento Vettori");  // Esercizio Fondamentale
            System.out.println("11) Trova il Minimo in un vettore ");
            System.out.println("12) Exit ");
            chose = input.nextInt();

            switch (chose){
                case 1:
                    System.out.println("Dimmi che tipo di numero Vuoi Scegliere?");
                    maths.Tabellina(input.nextInt());
                    break;

                case 2:
                    maths.SommaMultipli();
                    break;

                case 3:
                    try {
                        System.out.println("Aggiungi quante righe devono esistere: ");
                        int row = input.nextInt();
                        System.out.println("Aggiungi quante colonne devono esistere: ");
                        int col = input.nextInt();
                        maths.StampVet(row, col);
                    } catch (IllegalArgumentException e){
                        System.out.println("I Valori devono essere numeri, Riprova!!");
                    }
                    break;


                case 4:
                    System.out.println("Seleziona il limite totale: ");
                    int limit = input.nextInt();
                    maths.MinMax(limit);
                    break;

                case 5:
                    System.out.println(car.getWord());
                    break;

                case 6:
                    maths.MaxNumberinList();
                    break;

                case 7:
                    maths.SommaMatrice();
                    break;

                case 8:
                    System.out.println("Digita un numero tra 1 a 100 in decimale:");
                    int numb = input.nextInt();
                    maths.RicercaArray(numb);
                    break;

                case 9:
                    String[] list = ex.names;
                    String name = ex.trovaMinAscii(list);
                    System.out.println("Tutti i Nomi: ");
                    for (int count = 0; count < list.length; count++){
                        System.out.println(count + ") " + list[count] + ".");
                    }
                    System.out.println("Il Nome con Piu Caratteri ASCII: " + name);
                    break;

                case 10:
                    String[] names = ex.names;
                    String[] fun = ex.ordinaNome(names, "desc");
                    System.out.println("Tutti i Nomi: ");
                    for (int count = 0; count < names.length; count++){
                        System.out.println(count + ") " + names[count] + ".");
                    }
                    System.out.println("Lista Precedente: ");
                    for (int count = 0; count < fun.length; count++){
                        System.out.println(count + ") " + fun[count] + ".");
                    }
                    break;

                case 11:
                    ex.trovaMinMat(10, 10);
                    break;


                case 12:
                    System.exit(0);
                    break;


                default:
                    System.exit(0);
                    break;
            }

        } catch (InputMismatchException e) {
            System.out.println("Devi Inserire un Numero, Riprova!!");
            System.exit(0);
        }

}
