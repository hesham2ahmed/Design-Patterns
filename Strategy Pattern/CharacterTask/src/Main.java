public class Main {
    public static void main(String[] args) {

        Character queen = new Queen();
        Character king = new King();
        Character troll = new Troll();
        Character knight = new knight();

        System.out.println("Queen: " + queen.fight());
        System.out.println("King: " + king.fight());
        System.out.println("Troll: " + troll.fight());
        System.out.println("knight " + knight.fight());

        queen.setWeapon(new SwordBehavior());
        System.out.println("Queen: " + queen.fight());
    }
}
