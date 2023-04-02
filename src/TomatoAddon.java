public class TomatoAddon implements PizzaMachine{
    private PizzaMachine Pizza;
    public TomatoAddon(PizzaMachine TomatoADON ){
        this.Pizza=TomatoADON;
    }
    @Override
    public int getCost() {
        return Pizza.getCost()+60;
    }

    @Override
    public String GetDescription() {
        return Pizza.GetDescription()+"+ Tomato Added";
    }
}
