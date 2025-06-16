public class ex1 {
    //Moltiplicazione
    public static int moltiplica(int num1, int num2) {
        return num1 * num2;
    }

    // concatenazione
    public static String concatena(String parola, int num3) {
        return parola + num3;
    }

    //inserisciarray
    public static String[] inserisciInArray(String[] array, String parola) {
        String[] newArray = new String[6];

        newArray[0] = array[0];
        newArray[1] = array[1];
        newArray[2] = parola;
        newArray[3] = array[2];
        newArray[4] = array[3];
        newArray[5] = array[4];

        return newArray;
    }
}
