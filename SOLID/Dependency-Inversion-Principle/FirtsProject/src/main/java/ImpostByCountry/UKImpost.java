package ImpostByCountry;

import Interface.InterfaceImpostByCountry;

public class UKImpost implements InterfaceImpostByCountry {

    @Override
    public void calculeImpost(double values) {
        System.out.println("Impost reino unido foi: " + (values *= 0.23));
    }
}
