import java.util.Scanner;

public class Lab {
    Scanner input = new Scanner(System.in);


    public int leggiInt(String s) {
        int num = 0;
        boolean flag;

        do {
            System.out.println(s);
            flag = false;
            try {
                num = Integer.parseInt(input.nextLine());

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + " non hai fornito un numero intero!");
                flag = true;
            }

        } while (flag);

        return num;

    }


    public double leggiDouble(String s) {

        double num = 0;
        boolean flag;

        do {
            System.out.println(s);
            flag = false;
            try {
                num = Double.parseDouble(input.nextLine());

            } catch (NumberFormatException e) {

                System.out.println(e.getMessage() + " non hai fornito un numero double!");
                flag = true;
            }

        } while (flag);


        return num;

    }


    public String leggiString(String s) {
        System.out.println(s);

        return input.nextLine();
        //return input.next();
    }


    public void sommaValori() {

        int tot = leggiInt("Inserisci il primo valore:") + leggiInt("Inserisci il secondo valore:");
        System.out.println("la somma totale �:" + tot);


    }

    public void sommaValori(int num, int num2) //num=3 num2=5
    {
        int tot = num + num2;
        System.out.println("la somma totale �:" + tot);


    }


    public void contVerticale(int lim) //3
    {

        if (lim <= 0) {
            System.out.println("Valore inserito non valido!");
        } else {
            for (int i = lim; i >= 1; i--) {
                System.out.println(i);

            }


        }

    }


    public void contOriz(int lim) { //metodo conta in orizzontale

        if (lim <= 0) {
            System.out.println("Valore inserito non valido!");

        } else {


            for (int i = 1; i < lim; i++)
                System.out.print(i + ",");


            System.out.print(lim + ".");
        }

    }


    public void semaforo(String colore) {
        //Rosso
        colore = colore.toLowerCase();

        switch (colore) {

            case "rosso":
                System.out.println("FERMATI!");
                break;
            case "giallo":
                System.out.println("Attenzione!");
                break;
            case "verde":
                System.out.println("Vai!");
                break;
            default:
                System.out.println("non sei al semaforo!");
                break;
        }


    }

    public void occorrenzeVocali(String frase) {
        int consonanti = 0, a = 0, e = 0, i = 0, o = 0, u = 0;

        frase = frase.toLowerCase();

        // ciao a tutti!
        //System.out.println(frase);
        frase = frase.replaceAll("[^a-z]", "");
        //System.out.println(frase);

        for (int index = 0; index < frase.length(); index++) {
            char ch = frase.charAt(index);
            //if (Character.isLetter(ch))
            //{
            switch (ch) {
                case 'a' -> a++;

                case 'e' -> e++;

                case 'i' -> i++;

                case 'o' -> o++;

                case 'u' -> u++;

                default -> consonanti++;
                //}
            }
        }

        System.out.println("\nTOTALE DELLE VOCALI\n"
                + "a:" + a + " "
                + "e:" + e + " "
                + "i:" + i + " "
                + "o:" + o + " "
                + "u:" + u + " "
                + "\nTOTALE DELLE CONSONANTI: " + consonanti);
    }


    public boolean palindroma(String frase) {
        // CIAO, A TUTTI!
        //ciao, a tutti!

        //ciaoatutti

        //anina
        frase = frase.toLowerCase().replaceAll("[^a-z]", "");

        for (int i = 0; i < frase.length() / 2; i++)
            if (frase.charAt(i) != frase.charAt(frase.length() - i - 1))
                return false;


        return true;
    }


    public void totalizzatore() {

        String risposta;
        double somma = 0, cont = 0;
        //int min=Integer.MAX_VALUE;
        //int max=Integer.MIN_VALUE;
        int num = 0, min = 0, max = 0;


        do {
            cont++;
            num = leggiInt("Inserisci un valore:");
            somma += num;

            if (cont == 1) {
                min = num;
                max = num;
            } else {
                if (num < min)  //
                    min = num; //1000
                if (num > max)  // 1000
                    max = num;
            }

            risposta = leggiString("vuoi continuare? si/no:");
        } while (risposta.equalsIgnoreCase("si") || risposta.equalsIgnoreCase("s"));


        System.out.println("La somma totale:" + somma);
        System.out.println("La media �:" + somma / cont);
        System.out.println("il min valore inserito �: " + min + " il valore massimo �: " + max);


    }


    public void calcolatrice() {

        String operatore;

        double tot = 0;
        int i = 0;
        tot = leggiDouble("inserisci un numero");


        do {
            operatore = leggiString("+ - / * =");

            if (i > 0)
                System.out.println(tot);


            switch (operatore) {
                case "+":
                    tot += leggiDouble("inserisci un numero");
                    break;
                case "-":
                    tot -= leggiDouble("inserisci un numero");
                    break;
                case "/":
                    double val = leggiDouble("inserisci un numero");
                    if (val == 0) {
                        System.out.println("Impossibile dividere per 0!");
                        break;
                    } else {
                        tot /= val;
                    }
                    break;
                case "*":
                    tot *= leggiDouble("inserisci un numero");
                    break;
                case "=":
                    System.out.println("totale:" + tot);
                    break;

                default:
                    System.out.println("seleziona un operatore valido!");
                    break;
            }

            i++;
        } while (!operatore.equals("="));


    }


    public void sommaMultipli() {
        //trovare la somma di tutti i multipli di 3 e 5 minori di 1000(escluso)

        int limite = 1000; // Trova i multipli sotto il 1000
        int somma = 0;

        for (int i = 1; i < limite; i++)
            if (i % 3 == 0 || i % 5 == 0)
                somma += i;

        System.out.println("La somma dei multipli di 3 e 5 sotto " + limite + " �: " + somma);

    }


    public int[] initVet(int dim) throws NegativeArraySizeException {
        if (dim == 0) {
            throw new NegativeArraySizeException("Devi inserire almeno un elemento");
        }

        int[] vet = new int[dim];

        for (int i = 0; i < dim; i++) {
            vet[i] = leggiInt("Insersci il " + (i + 1) + "� valore");
        }

        return vet;
    }


    public void stampaVet(int[] vet) {
        for (int i = 0; i < vet.length; i++)
            System.out.print(vet[i] + " ");


    }


    public double[] minMax(int[] vet) {
        int minPari = Integer.MAX_VALUE,
                minDispari = Integer.MAX_VALUE,
                maxPari = Integer.MIN_VALUE,
                maxDispari = Integer.MIN_VALUE,
                totPari = 0,
                totDispari = 0;

        double media = 0;


        for (int i = 0; i < vet.length; i++) {
            if (vet[i] % 2 == 0) {
                minPari = Integer.min(vet[i], minPari);
                maxPari = Integer.max(vet[i], maxPari);
                totPari += vet[i];
            } else {
                minDispari = Integer.min(vet[i], minDispari);
                maxDispari = Integer.max(vet[i], maxDispari);
                totDispari += vet[i];
            }
        }

        media = (double) (totPari + totDispari) / vet.length;

        return new double[]{media, minDispari, minPari, maxDispari, maxPari, totDispari, totPari};

    }


    public void printInfoMinMax(double[] vet) {
        System.out.println("Media: " + vet[0] + "\n");

        if (vet[2] != Integer.MAX_VALUE) { //se esiste un numero pari
            System.out.println("Minimo pari: " + vet[2] + "\n"
                    + "Massimo pari: " + vet[4] + "\n"
                    + "Totale pari: " + vet[6] + "\n");
        } else
            System.out.println("Non ci sono numeri pari!\n");


        if (vet[1] != Integer.MAX_VALUE) {//se esiste un numero dispari
            System.out.println("Minimo dispari: " + vet[1] + "\n"
                    + "Massimo dispari: " + vet[3] + "\n"
                    + "Totale dispari: " + vet[5] + "\n");
        } else
            System.out.println("Non ci sono numeri dispari!\n");

    }


    public int stampaMenu() {
        System.out.println("\nMENU");
        System.out.println("1)sommaValori ");
        System.out.println("2)contVerticale ");
        System.out.println("3)contOriz ");
        System.out.println("4)semaforo ");
        System.out.println("5)occorrenzeVocali ");
        System.out.println("6)palindroma ");
        System.out.println("7)totalizzatore ");
        System.out.println("8)calcolatrice ");
        System.out.println("9) sommaMultipli");
        System.out.println("10) stampaVet");
        System.out.println("11) minMax");


        System.out.println("0) ESCI ");

        return leggiInt("Fai una scelta:");


    }

}
