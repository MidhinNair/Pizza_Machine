public class Pepperonipizza implements PizzaMachine{
    private PizzaMachine Pizza;
    public Pepperonipizza (){};
    public Pepperonipizza(PizzaMachine PPizza ){
        this.Pizza=PPizza;
    }

    @Override
    public int getCost() {
        if(Pizza!=null){
            return getCost() + 180;
        }
        return 180;
    }

    @Override
    public String GetDescription() {
        if(Pizza!=null){
            return GetDescription()+"pepperoni pizza with";
        }
        return " pepperoni pizza with ";
    }
}
