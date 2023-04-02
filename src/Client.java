public class Client {
    public static void main(String[] args) {
        PizzaMachine p = new PaneerAddon(new CheeseAddon(new TomatoAddon(new BBQChickenpizza())));
        System.out.print("Order Placed : ");
        System.out.println(p.GetDescription());
        System.out.print("Total Cost : ");
        System.out.println(p.getCost());
    }
}
