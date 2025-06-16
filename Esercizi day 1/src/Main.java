import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //riprendo moltiplica
        int num1 = 7;
        int num2 = 12;
        int prodotto = ex1.moltiplica(num1, num2);
        System.out.println(prodotto);

        //concat
        String concatenazione = ex1.concatena("ciao ", 4);
        System.out.println("concatenazione :" + concatenazione);

        //inserisciArray
        String[] arraySium = {"uno", "due", "tre", "quattro", "cinque"};
        String inserire = "sono dentro";

        String[] risultato = ex1.inserisciInArray(arraySium, inserire);
        System.out.println(Arrays.toString(risultato));

        Scanner scanner = new Scanner(System.in);

        System.out.println("prima stringa: ");
        String p1 = scanner.nextLine();

        System.out.println("seconda stringa: ");
        String p2 = scanner.nextLine();

        System.out.println("terza stringa: ");
        String p3 = scanner.nextLine();

        String concatNormale = p1 + p2 + p3;

        String concatInverso = p3 + p2 + p1;

        System.out.println("concat normale: " + concatNormale);
        System.out.println("concat inverso: " + concatInverso);

        scanner.close();
    }
}
