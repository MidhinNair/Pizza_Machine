import java.util.concurrent.RecursiveTask;

public class BBQChickenpizza implements PizzaMachine {
    private PizzaMachine Pizza;
    BBQChickenpizza(){};
    public BBQChickenpizza(PizzaMachine BBQPizza){
        this.Pizza = BBQPizza;
    }

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
            return GetDescription()+"BBQ Chicken Pizza with";
        }
        return "BBQ Chicken Pizza with";
    }
}
