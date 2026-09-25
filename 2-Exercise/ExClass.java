import java.util.Random;
import java.util.Scanner;

public class ExClass {
    Scanner input = new Scanner(System.in);
    String[] names = {"Anna", "Marco", "Pippo", "Mario", "Giovanni"};
    int[][] numbers = {
            { 10, 20, 30, 40, 41 },
            { 50, 60, 70, 80, 85 },
            { 90, 99, 100, 101, 102 }
    };
    Random random = new Random();

    // 1. Ottiene la Somma di Ciasuna Lettera in una Parola
    public int sumsLetters(String letter) {
        if(letter.equals("")){
           throw new IllegalArgumentException("L'argomento non valido, riprova!!");
        }

        int length = letter.length();
        int sums = 0;
        for (int count = 0; count < length; count++){
            sums += letter.charAt(count);
        }
        return sums;
    }

    // 2. Trova la Parola con la Somma piu grande rispetto altre in ASCII
    public String trovaMinAscii(String[] nominativi){
        int minSomma = 0;
        String nomeMin = "";
        int sums = 0;

        for (int count = 0; count < nominativi.length; count++){
            sums = sumsLetters(nominativi[count]);
            if(sums > minSomma) {
                minSomma = sums;  // Somma ASCII di ciascuna lettera
                nomeMin = nominativi[count]; // Lettera Scelta in base alla somma
            } else {
                if(nominativi[count].compareTo(nomeMin) > 0){  // Cofronto Unicode/ASCII
                    nomeMin = nominativi[count];
                }
            }
        }

        return nomeMin;
    }

    // Ordinamento Vettore di Stringa
    public String[] ordinaNome(String[] vettore, String ordine){
        int length = vettore.length;
        String current = "";

        // 1. Aggiunta delle risorse nella copia
        String[] copia = new String[length];
        for (int i = 0; i < length; i++) {
            copia[i] = vettore[i];
        }

        // 2. Modifica delle risorse in lista (selection sort)
        for (int exterior = 0; exterior < length; exterior++){  // Scorrimento ordinato
            for (int interior = 0; interior < length - 1 - exterior; interior++){  // Scorrimento adiacente
                String prev = copia[interior];
                String next = copia[interior + 1];

                // 3. Ordinamento in base confronto lessico-grafico con ogni risorsa.
                if (ordine.equals("asc")) {
                    if(prev.compareTo(next) > 0){
                        current = copia[interior];
                        copia[interior] = copia[interior + 1];
                        copia[interior + 1] = current;
                    }
                } else if (ordine.equals("desc")) {
                    if(prev.compareTo(next) < 0){
                        current = copia[interior];
                        copia[interior] = current;
                        copia[interior + 1] = copia[interior + 1];
                    }
                }
            }
        }

        // 4. Restituzione Lista
        return copia;
    }

    // Trovare nella matrice per ogni riga il numero minimo solo nella prima riga
    // con la stampa del valore.
    // Con al massimo uno scambio in un determinata allocazione.

    public void trovaMinMat(int rows, int cols){
        int minNumb = Integer.MIN_VALUE;
        int current = 0;
        int[][] list = new int[rows][cols];
        int indexCurrent = 0;

        // 1. Creazione del Array
        for (int row = 0; row < list.length - 1; row++) {
            for (int col = 0; col < list[row].length - 1; col++) {
                int currentNumber = random.nextInt(-20, 80);
                list[row][col] = currentNumber;
                System.out.println("Lista[" + row + "][" + col + "] = " + list[row][col]);
            }
        }

        // 2. Trovare il Minimo nella lista
        for (int row = 0; row < list.length - 1; row++) {
            for (int col = 0; col < list[row].length - 1; col++) {
               if(list[row][col] > list[row][0]){  // Punto Chiave del Metodo.
                   indexCurrent = col;
               } else {
                   current = list[row][indexCurrent];
                   list[row][0] = current;
                   list[row][0] = list[row][0];
                }

            }
        }

        // 3. Stampa del Valore
        System.out.println("Il Lista Modificata: ");
        for (int row = 0; row < list.length - 1; row++) {
            for (int col = 0; col < list[row].length - 1; col++) {
                System.out.println("Lista[" + row + "][" + col + "] = " + list[row][col]);
            }
        }

    }
}
