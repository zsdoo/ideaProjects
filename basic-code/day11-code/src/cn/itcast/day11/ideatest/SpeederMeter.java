public abstract class SpeederMeter {
    private double turnRate;
    public SpeederMeter(){}
    public abstract double callGirth();
    public void setTurnRate(double turnRate){
        this.turnRate=turnRate;
    }
    public double getSpeed(){
        return this.turnRate * this.callGirth();
    }
}
