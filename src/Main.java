import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
     String [] TiposDCambio =new String[3];
     TiposDCambio[0]="PesosADollar";
     TiposDCambio[1]="DollarAPesos";
     TiposDCambio[2]="EusosADollar";
        String tipoDivisa = JOptionPane.showInputDialog(null,"ingresa el dipo de convercion", TiposDCambio);
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir \n "));
        Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.DollarAPesos);
        DollarAPesos dollarAPesos = (DollarAPesos) divisa;

        dollarAPesos.setDollar(numero);
        System.out.println(divisa.calculaDivisa());

        divisa = DivisaFactory.crearDivisa(TipoDivisa.PesosADollar);
        PesosADollar pesosADollar =(PesosADollar) divisa;
        pesosADollar.setPesos(numero);
        System.out.println(divisa.calculaDivisa());

    }




}



