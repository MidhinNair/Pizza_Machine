public class PaneerAddon implements PizzaMachine{
    private PizzaMachine Pizza;
    public PaneerAddon (PizzaMachine PaneerADON){
        this.Pizza=PaneerADON;
    }
    @Override
    public int getCost() {
        return Pizza.getCost()+80;
    }

    @Override
    public String GetDescription() {
        return Pizza.GetDescription()+"+ Paneer Added";
    }
}
