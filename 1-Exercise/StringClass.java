import java.util.Locale;
import java.util.Scanner;

public class StringClass {
    Scanner input = new Scanner(System.in);
    private String text = "";

    public int leggiInt(String s){
        System.out.println(s);
        int num = Integer.parseInt(input.nextLine());
        return num;
    }

    public String leggiString(String s){
        System.out.println(s);
        return input.nextLine();
    }

    public void semaforo(String colore) {
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

    public boolean palindroma(String texts){
        String word = texts.toLowerCase().replaceAll("[^a-z]", "");
        for (int index = 0; index < text.length() / 2; index++)
            if(word.charAt(index) != word.charAt(word.length() - index - 1))
                return true;

        return false;
    }

}
