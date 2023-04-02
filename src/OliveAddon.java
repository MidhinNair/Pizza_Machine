public class OliveAddon implements PizzaMachine {

private PizzaMachine Pizza;
public  OliveAddon (PizzaMachine OliveADON){
    this.Pizza=OliveADON;
}
@Override
    public int getCost() {
        return Pizza.getCost()+20;
    }

    @Override
    public String GetDescription() {
        return Pizza.GetDescription()+"+ Olive Added";
    }
}
