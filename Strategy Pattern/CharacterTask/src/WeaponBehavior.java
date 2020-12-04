public interface WeaponBehavior {
    public String useWeapon();
}

class KnifeBehavior implements WeaponBehavior{

    @Override
    public String useWeapon() {

        return "Fight with knife";
    }
}

class BowAndArrowBehavior implements WeaponBehavior{

    @Override
    public String useWeapon() {

        return "Fight with bow and arrow";
    }
}

class AxeBehavior implements WeaponBehavior{

    @Override
    public String useWeapon() {

        return "Fight with axe";

    }
}


class SwordBehavior implements WeaponBehavior{

    @Override
    public String useWeapon() {

        return "Fight with sword";
    }
}
