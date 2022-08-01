package ImpostByCountry;

import Interface.InterfaceImpostByCountry;

public class BrazilImpost implements InterfaceImpostByCountry {


    @Override
    public void calculeImpost(double values) {
        System.out.println("Impost brasil foi: " + (values *= 0.34));
    }
}
