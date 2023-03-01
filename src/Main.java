import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) throws Exception {

        String[] tiposDCambio = {"PesosADollar", "DollarAPesos", "EurosADollar"};


        String conversion = (String) JOptionPane.showInputDialog(null,
                "Ingrese la cantidad de dinero que desea convertir", "Divisa", JOptionPane.PLAIN_MESSAGE,
                null, tiposDCambio, tiposDCambio[0]);

        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero que " +
                "desea convertir \n "));

      //  Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.valueOf(conversion));





        switch (conversion) {
            case "DollarAPesos" -> {

                Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.valueOf(conversion));
                DollarAPesos dollarAPesos = (DollarAPesos) divisa;

                dollarAPesos.setDollar(numero);
                JOptionPane.showInternalMessageDialog(null, "El resultado es: "+
                        divisa.calculaDivisa());


            }
            case "PesosADollar" -> {

                Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.valueOf(conversion));
                PesosADollar pesosADollar = (PesosADollar) divisa;

                pesosADollar.setPesos(numero);
                JOptionPane.showInternalMessageDialog(null, "El resultado es: "+
                        divisa.calculaDivisa());
            }
            case "EurosADollar" -> {

                Divisa divisa = DivisaFactory.crearDivisa(TipoDivisa.valueOf(conversion));
                EurosADollar eurosADollar = (EurosADollar) divisa;

                eurosADollar.setEuros(numero);
                JOptionPane.showInternalMessageDialog(null, "El resultado es: "
                        + divisa.calculaDivisa());
            }


        }



    }





//se requiere el manejo de las esepciones como NumberFormatException  | NullPointerException
    // aun le falta mucha legibilidad a mi codigo



    }







