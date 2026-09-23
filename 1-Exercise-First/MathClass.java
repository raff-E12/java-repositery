import java.util.Scanner;

public class MathClass {
    Scanner input = new Scanner(System.in);

    public void ContaOrrizontale(int limit){
        if(limit <= 0) System.out.println("Valore inserito non valido!");
        for(int i = 0; i > limit; i++)
            System.out.print("Numero: " + i + ",");
        System.out.print(limit + ".");
    }

    public void ContaVerticale(int limit){
        if(limit <= 0) System.out.println("Valore inserito non valido!");
        for(int i = 0; i > limit; i++)
            System.out.print("Numero: " + i + ",");
        System.out.print(limit + ".");
    }

    public void SommaNumeri(int numb1, int numb2){
        int rs = numb1 + numb2;
        System.out.println("Il Risultato è: " + rs + ".");
    }

    public void totalizzatore(){
        String isContinue = "";
        int numb = 0;
        int tot = 0, max = 0, min = 0, average = 0;

        do {
            System.out.println("Inserisci un valore: ");
            numb = input.nextInt();
            input.nextLine();

            tot += numb;
            if(numb > max) max = numb;
            if (numb < min) min = numb;

            do {
                System.out.println("Vuoi Continuare?");
                isContinue = input.nextLine();

                if(!isContinue.equals("si") && !isContinue.equals("no"))
                    System.out.println("La Risposta non Valida, Riprova!!");
            } while (!isContinue.equals("si") && !isContinue.equals("no"));

        } while(isContinue.equals("si"));

        average = tot / numb;
        System.out.println("Sessione Finita: " + "Totale " + tot + ", Max " + max + ", Min " + min + ", Media " + average + ".");
    }


    // Calcolatrice
    // 1. valore iniziale e precendente con un operazione.
    // 2. Totale da tracciare con un altra operazione affiancata all infinito.
    // 3. Pulasanti di iterazione di opeazioni e invio per l'uguale.
    // 4. Tasto di Reset del display

    public void Calcolatrice(){
        double numb1 = 0;
        double numb2 = 0;
        double numb3 = 0;
        double rs = 0;
        boolean isContinue = false;
        char op = ' ';
        String chose = "";
        String history = "";
        double prev = 0; // Risultato di prima

        System.out.println("Scrivi due Numeri effetuare le Operazioni:");
        System.out.println("Scrivi il Primo Numero:");
        numb1 = input.nextDouble();

        System.out.println("Scrivi il Secondo Numero:");
        numb2 = input.nextDouble();

        System.out.println("Scegli l'Operazione (+, -, *, /):");
        op = input.next().charAt(0);

        switch (op) {
            case '+':
                rs = numb1 + numb2;
                break;

            case '-':
                rs = numb1 - numb2;
                break;

            case '*':
                rs = numb1 * numb2;
                break;

            case '/':
                if (numb2 == 0) {
                    System.out.println("Dividere per zero non è autorizzato.");
                    return;
                }
                rs = numb1 / numb2;
                break;

            default:
                System.out.println("Operazione invalida.");
                return;
        }

        history = numb1 + " " + op + " " + numb2 + " = " + rs;
        System.out.println("Risultato Finale:");
        System.out.println(history); // Operazione Grafica

        // Permette la Ripetizione della logica in maniera grafica.
        System.out.println("Vuoi Scegliere Enter / Finish?");
        chose = input.next();
        if (chose.equalsIgnoreCase("Enter")) isContinue = true;

        if (isContinue) {
            do {
                System.out.println("Scrivi il Numero:");
                numb3 = input.nextDouble();
                history = "";
                prev = rs;

                System.out.println("Scegli l'Operazione (+, -, *, /):");
                op = input.next().charAt(0);

                switch (op) {
                    case '+': rs += numb3; break;
                    case '-': rs -= numb3; break;
                    case '*': rs *= numb3; break;
                    case '/':
                        if (numb3 == 0) {
                            System.out.println("Dividere per zero non è autorizzato.");
                            return;
                        }
                        rs /= numb3;
                        break;
                    default:
                        System.out.println("Operazione invalida.");
                        return;
                }

                history = prev + " " + op + " " + numb2 + " = " + rs;

                System.out.println(history);
                System.out.println("Risultato Finale: " + rs);
                System.out.println("Vuoi Scegliere Enter / Finish?");

                chose = input.next();
                if (chose.equalsIgnoreCase("Finish")) isContinue = false;

            } while (isContinue);
        }

        System.out.println("Risultato Finale: " + rs + ".");
    }
}
