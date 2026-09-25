public class MathClass {

    int numb = 0;

    public void Tabellina(int limit){
        int rs = 0;
        System.out.println("Tabellina del " + limit + ".");
        for (int index = 0; index < 11; index++){
            rs = limit * index;
            System.out.println(index + ") " +  limit + "x" + index + "=" + rs);
        }
        System.out.println("Fine Sessione.");
    }

    // Trovare la somma di tutti i multipli di 3 e 5 minori di 1000(escluso)
    public void SommaMultipli(){
          try {
              int max = 999;
              int sum = 0;
              int length = 0;
              int[] numbers = new int[max];

              for (int index = 0; index < max; index++){
                  if (index % 3 == 0 || index % 5 == 0){
                      numbers[length] = index;
                      length++;
                  }
              }

              for(int count = 0; count < length; count++){
                  sum += numbers[count];
              }

              System.out.println("Somma dei Multipli è: " + sum + ".");
          } catch (Exception e) {
              throw new RuntimeException(e);
          }
    }

    // Funzione delle Matrici
    public void StampVet(int rows, int cols) throws NumberFormatException{

        if(rows != 0 && cols != 0){
            throw new NumberFormatException("I Due Valori devono essere Numeri, Riprova!!");
        }

        int[][] lists = new int[rows][cols];
        for (int row = 0; row < lists.length - 1; row++) {
            for (int col = 0; col < lists[row].length - 1; col++) {
                lists[row][col] = row + col;
                System.out.println("Lista[" + row + "][" + col + "] = " + lists[row][col]);
            }
        }
    }

    // Min && Max Tra Dispari e Pari
    public void MinMax(int limit){
        int[] vectory = new int [limit];
        int maxDisp = Integer.MAX_VALUE, minDisp =  Integer.MIN_VALUE;
        int maxPar =  Integer.MAX_VALUE, minPar =  Integer.MIN_VALUE;
        int SumPar = 0, SumDisp = 0;
        double average = 0;

        for(int index = 0; index < limit; index++)
            vectory[index] = index;

        for(int count = 0; count < vectory.length - 1; count++){
            if(count % 2 == 0){
                minPar = Integer.min(vectory[count], minPar);
                maxPar = Integer.max(vectory[count], maxPar);
                SumPar += vectory[count];
            } else {
                minDisp = Integer.min(vectory[count], minDisp);
                maxDisp = Integer.max(vectory[count], maxDisp);
                SumDisp += vectory[count];
            }
        }

        average = (double)(SumPar + SumDisp) / vectory.length;
       System.out.println("Ecco i risultati: {" + maxDisp + "," + minDisp + "," + maxPar + "," + minPar + "}.");
    }

    // Massimo in un array
    public void MaxNumberinList(){
        int[] list = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 23, 45 };
        int max = list[0];
        for (int count = 0; count < list.length; count++){
            if(list[count] > max){
                max = list[count];
            }
        }
        System.out.println("Il numero Massimo: " + max);
    }

    // Somma Matrice 3x3
    public void SommaMatrice(){
        int[][] matrice = new int[3][3];
        int sums = 0;

        for (int row = 0; row < matrice.length; row++){
            for (int col = 0; col < matrice[row].length; col++){
                matrice[row][col] = row;
            }
        }

        for (int row = 0; row < matrice.length; row++){
            for (int col = 0; col < matrice[row].length; col++){
                sums += matrice[row][col];
            }
        }

        System.out.println("La Somma è: " + sums);
    }

    // Ricerca valore nel'array
    public void RicercaArray(int numb) throws NumberFormatException{

        if(numb != 0){
            throw new NumberFormatException("Il Numero non deve Essere Zero, Riprova!!");
        }

        int[] list = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 102 };
        int rs = 0;

        for (int count = 0; count < list.length; count++){
            if(list[count] == numb){
                rs = list[count];
                break;
            }
        }

        if(rs != 0) System.out.println("Numero Trovato: " + rs);
        else System.out.println("Numero non Trovato: " + rs);
    }
}
