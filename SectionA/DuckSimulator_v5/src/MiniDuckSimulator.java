public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.swim();
        mallard.performFly();

        Duck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performQuack();
        redheadDuck.swim();
        redheadDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.swim();
        rubberDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.performFly();

        modelDuck.setFlyBehavior(new FlyWithRocketPower());

        modelDuck.display();
        modelDuck.performQuack();
        modelDuck.swim();
        modelDuck.performFly();

    }
}