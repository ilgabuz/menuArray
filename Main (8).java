import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        int[] values = new int[10];

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean rispostaquadrata = true;

        do {
            System.out.println(" ");
            System.out.println("1.caricamento tastiera");
            System.out.println("2.caricamento random");
            System.out.println("3.visualizzazione");
            System.out.println("4.inserimento in posizione");
            System.out.println("5.cancellazione di un elemento cercato");
            System.out.println("6.Esci");


            int answer = in.nextInt();

            switch (answer) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Inserisci il " + (i + 1) + "^ elemento dell'Array");
                        values[i] = in.nextInt();
                    }
                    break;

                case 2: System.out.println("Questo è l'array con gli elementi randomizzati:");
                    for (int i = 0; i < 10; i++) {
                        values[i] = rnd.nextInt(10) + 1;

                    }
                    break;

                case 3:

                    for (int i = 0; i < 10; i++) {
                        System.out.print(values[i] + " ");
                    }
                    break;

                case 4: System.out.println("Dove vorresti aggiungere un elemento dell'Array? (Scrivi il numero della posizione)");
                    int posizione = in.nextInt();
                    System.out.println("Inserisci l'elemento che vorresti aggiungere");
                    values[posizione] = in.nextInt();


                    break;

                case 5:
                    System.out.println(" ");
                    System.out.println("Quale elemento dell'Array vorresti cancellare? (Scrivi il numero della posizione)");
                    int posizione1 = in.nextInt();

                    System.out.println("Inserisci l'elemento che vorresti cancellare");
                    values[posizione1] = 0;



                    break;

                case 6:
                    rispostaquadrata = false;
                    break;

            }
        }while (rispostaquadrata) ;


    }
}