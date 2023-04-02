public class Farmhousepizza implements PizzaMachine {
    private PizzaMachine Pizza;
    public Farmhousepizza(){};
    public Farmhousepizza(PizzaMachine FPizza){
        this.Pizza =FPizza;
    }
    @Override
    public int getCost() {
        if(Pizza !=null){
            return Pizza.getCost()+ 150;
        }
        return 150;
    }

    @Override
    public String GetDescription() {
        if(Pizza !=null){
            return Pizza.GetDescription()+"+ farmhouse pizza with";
        }
        return "farmhouse pizza with";
    }
}
