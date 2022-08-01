import ImpostByCountry.BrazilImpost;
import ImpostByCountry.EUAImpost;
import ImpostByCountry.UKImpost;

public class application {

    public static void main(String[] args) {

        System.out.println("teste apenas");

        ImpostCalculator imposto = new ImpostCalculator(new BrazilImpost());
        imposto.calcularImposto(20);
    }
}
