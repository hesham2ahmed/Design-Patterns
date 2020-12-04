public abstract class Character {
    protected WeaponBehavior weapon;

    public String fight() {
        return weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }
}
