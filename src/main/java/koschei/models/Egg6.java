package koschei.models;

public class Egg6 {

    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle.toString();
    }

    public Egg6(Needle7 needle) {
        this.needle = needle;
    }
}
