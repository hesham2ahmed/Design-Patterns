public class Main {

    public static void main(String[] args) {

        Animals dog = new Dog();
        Animals bird = new Bird();

        System.out.println("Dog : " + dog.tryToFly());
        System.out.println("Bird : " + bird.tryToFly());

        dog.setAbilityToFly(new ItFly());
        bird.setAbilityToFly(new CantFly());

        System.out.println("Dog : " + dog.tryToFly());
        System.out.println("Bird : " + bird.tryToFly());

    }
}
