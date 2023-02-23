public class Main {
    public static void main(String[] args) {
       Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.DollarAPesos);
       DollarAPesos dollarAPesos =(DollarAPesos) divisa;
       dollarAPesos.setDollar(5);
       System.out.println(divisa.calculaDivisa());

    divisa = DivisaFactory.crearDivisa(TipoDivisa.PesosADollar);
    PesosADollar pesosADollar =(PesosADollar) divisa;
    pesosADollar.setPesos(200);
       System.out.println(divisa.calculaDivisa());
}
}