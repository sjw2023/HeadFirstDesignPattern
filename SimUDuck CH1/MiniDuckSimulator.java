public class MiniDuckSimulator{
    public static void main(String[] args){
        Duck mallard =  new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        //testing the dynamic behavior setting
        Duck model = new ModelDuck();
        model.performFly(); // this will call the method that is defined in ModelDuck
        model.setFlyBehavior( new FlyRocketPowered() ); // this will set flyBehavoir in model duck as FlyRocketPowered
        model.performFly();
    }
}
