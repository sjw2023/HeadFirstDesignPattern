public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior = new FlyNoWay(); // Initiate with no fly, its model Duck
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm a model duck");
    }
}
