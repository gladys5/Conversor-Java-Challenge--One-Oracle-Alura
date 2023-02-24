import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
     String [] TiposDCambio =new String[3];
     TiposDCambio[0]="PesosADollar";
     TiposDCambio[1]="DollarAPesos";
     TiposDCambio[2]="EurosADollar";

//Tipo de cambio tiene que resivir todos los string dinamicos
        String tipoDivisa = JOptionPane.showInputDialog(null,TiposDCambio);
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que desea convertir \n "));
        Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.DollarAPesos);
        DollarAPesos dollarAPesos = (DollarAPesos) divisa;

        dollarAPesos.setDollar(numero);
         JOptionPane.showInputDialog(null,"El resultado es: ",divisa.calculaDivisa());

/*
        divisa = DivisaFactory.crearDivisa(TipoDivisa.PesosADollar);
        PesosADollar pesosADollar =(PesosADollar) divisa;
        pesosADollar.setPesos(numero);
        JOptionPane.showInputDialog(null,"El resultado es: ",divisa.calculaDivisa());
*/



 //requiero dinamizar variables para reducir codigo ,lo primero que se me ocurre es crear un array y que este sea iterado hasta encontrar el valor pasado por el usuario
        // con este valor cambiar la clase pasada a DivisaFactory.crearDivisa
    }




}



