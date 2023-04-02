public class Margheritapizza implements PizzaMachine {
    private  PizzaMachine Pizza;
    public Margheritapizza(){};
    public Margheritapizza(PizzaMachine MPizza){
        this.Pizza=MPizza;
    };
    @Override
    public int getCost() {
        if(Pizza!=null){
            return Pizza.getCost()+200;
        }
        return 200;
    }

    @Override
    public String GetDescription() {
        if(Pizza!=null){
            return Pizza.GetDescription()+"+ Margherita Pizza with.";
        }
        return "Margherita Pizza with .";
    }
}
