public class DivisaFactory {

        public static  Divisa crearDivisa (TipoDivisa tipoDivisa){

            switch (tipoDivisa) {
                case DollarAPesos -> {
                    return new DollarAPesos();
                }
                case PesosADollar -> {
                    return new PesosADollar();
                }
                case EurosADollar -> {
                    return new EurosADollar();
                }

         }
            return null;
        }

    }
