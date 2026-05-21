public class Bottle{
    private double intial;
    private double current;
    public Bottle(double intial){
        this.intial = intial;
        this.current = intial;

    }
    public double updateAmount(double used){
        current -= used;
        if (current < (intial / 4)){
            current = intial;
        }
        return current;
    }
}
