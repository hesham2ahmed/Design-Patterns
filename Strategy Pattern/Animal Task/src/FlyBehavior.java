public interface FlyBehavior {
     public String Fly();
}

class CantFly implements FlyBehavior {
    @Override
    public String Fly() {
        return "Can't Fly";
    }
}

class ItFly implements FlyBehavior {
    @Override
    public String Fly() {
        return "Fly heigh";
    }
}

class RocketPoweredFly implements FlyBehavior{

    @Override
    public String Fly() {
        return "Rocket-Powered-Fly";
    }
}