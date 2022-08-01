package ImpostByCountry;

import Interface.InterfaceImpostByCountry;

public class EUAImpost implements InterfaceImpostByCountry {


    @Override
    public void calculeImpost(double values) {
        System.out.println("Impost americano foi: " + (values *= 0.08));
    }
}
