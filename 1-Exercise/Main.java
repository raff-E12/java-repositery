//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner input = new Scanner(System.in);
    MathClass math = new MathClass();
    StringClass string = new StringClass();
    boolean isExit = false;

    do {
        System.out.println("Seleziona un Opzione:");
        System.out.println("MENU");
        System.out.println("1) sommaValori ");
        System.out.println("2) contVerticale ");
        System.out.println("3) contOrizzontale ");
        System.out.println("4) Semaforo ");
        System.out.println("5) ESCI ");
        System.out.println("6) Totalizzatore ");
        System.out.println("7) Calcolatrice ");

        int caseOp = input.nextInt();

        switch (caseOp){
            case 1:
                System.out.println("Imposta il Primo Numero: ");
                int numb1 = input.nextInt();
                System.out.println("Imposta il Secondo Numero: ");
                int numb2 = input.nextInt();
                math.SommaNumeri(numb1, numb2);
                break;

            case 2:
                System.out.println("Imposta un Limite: ");
                int limit = input.nextInt();
                math.ContaVerticale(limit);
                break;

            case 3:
                System.out.println("Imposta un Limite: ");
                int limits = input.nextInt();
                math.ContaOrrizontale(limits);
                break;

            case 4:
                System.out.println("Seleziona il Colore:");
                String color = input.nextLine();
                string.semaforo(color);
                break;

            case 5:
                isExit = true;
                System.exit(0);
                break;

            case 6: math.totalizzatore();

            case 7: math.Calcolatrice();

            default: System.out.println("Fine Sessione!!");
        }
    } while(isExit);
}
