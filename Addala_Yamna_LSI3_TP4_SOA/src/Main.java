import service.CalculWS;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CalculWS calculWS = new CalculWS();

                double val1 = 10.0;
                double val2 = 5.0;

                double result = calculWS.Somme(val1, val2);

                System.out.println("Le résultat de la somme est : " + result);
            }
}
