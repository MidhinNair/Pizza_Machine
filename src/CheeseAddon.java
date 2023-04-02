public class CheeseAddon implements PizzaMachine {
    private PizzaMachine Pizza;
    public CheeseAddon(PizzaMachine CheeseADON){
        this.Pizza= CheeseADON;
    }
    @Override
    public int getCost() {
        return Pizza.getCost()+ 80;
    }

    @Override
    public String GetDescription() {
        return Pizza.GetDescription() +"+Cheese Added";
    }
}
