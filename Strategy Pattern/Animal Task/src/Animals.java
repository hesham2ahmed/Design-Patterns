public  abstract class  Animals {

    public FlyBehavior flyingType;

    public String tryToFly(){
        return flyingType.Fly();
    }

    public void setAbilityToFly(FlyBehavior New){
        this.flyingType = New;

    }

}
