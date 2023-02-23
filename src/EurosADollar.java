public class EurosADollar extends Divisa {
    private double euros;
    private double dollar = 1.06;

    public EurosADollar() {

    }
    public EurosADollar(double euros,double dollar){
        this.euros = euros;
        this.dollar =dollar;
    }
    public double getEuros(){
        return euros;
    }
    public void  setEuros(double euros){
        this.euros =euros;
    }
    public double getDollar(){
        return dollar;
    }
    public void setDollar(double dollar){
        this.dollar = dollar;
    }
    @Override
    public double calculaDivisa(){
        return euros*dollar;
    }
}
