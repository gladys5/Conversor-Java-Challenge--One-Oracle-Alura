public class DollarAPesos extends Divisa {
    private double pesos = 20;

    private double dollar;

    public DollarAPesos() {

    }
    public DollarAPesos(double pesos,double dollar){
        this.pesos = pesos;
        this.dollar =dollar;
    }
    public double getPesos(){
        return pesos;
    }
    public void  setPesos(double pesos){
        this.pesos =pesos;
    }
    public double getDollar(){
        return dollar;
    }
    public void setDollar(double dollar){
        this.dollar =dollar;
    }
    @Override
    public double calculaDivisa(){
        return pesos*dollar;
    }
}

