import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class puzzle {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Pichau\\Documents\\codd\\input.txt");
        int soma = 0;
        int primeiroNumero = 0;
        int ultimoNumero = 0;
        boolean first = true;
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            for (char teste : input.nextLine().toCharArray()) {
                if (Character.isDigit(teste)) {
                    int sla = Character.getNumericValue(teste);
                    if (first) {
                        primeiroNumero = sla;
                        ultimoNumero = sla;
                        first = false;
                    } else {
                        ultimoNumero = sla;
                    }
                }

            }
            if (ultimoNumero != 0) {
                soma += (primeiroNumero * 10) + ultimoNumero;
            } else {
                soma += primeiroNumero;
            }
            ultimoNumero = 0;
            primeiroNumero = 0;
            first = true;
        }
        System.out.println(soma);
    }
}
