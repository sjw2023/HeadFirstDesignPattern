public class MallardDuck extends Duck{
    public MallardDuck(){
        quackBehavior = new Quack();//delegate the job to behavior classes
        flyBehavior = new FlyWithWings();// Polymorphism
    }

    public void display(){
        System.out.println("I'm a real Mallard duck");
    }
}
