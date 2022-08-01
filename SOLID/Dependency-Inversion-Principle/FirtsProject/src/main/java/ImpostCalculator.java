import Interface.InterfaceImpostByCountry;

public class ImpostCalculator {

    InterfaceImpostByCountry imposto;

    public ImpostCalculator(InterfaceImpostByCountry imposto){
        this.imposto = imposto;
    }

    public void calcularImposto(double values){
        this.imposto.calculeImpost(values);
    }

}
