public class Archangel extends BaseChampion implements Champion {

    public static final String TYPE = "Archangel";

    private Integer mana;

    public Archangel(String username, Integer level, Integer mana) {
        super(Archangel.TYPE, username, level);
        this.mana = mana;
    }

    @Override
    public String getHashedPassword() {
        StringBuilder result = new StringBuilder();
        result.append(this.getUsername().toCharArray());
        result.reverse();
        result.append(this.getUsername().length() * 21);

        return result.toString();
    }

    @Override
    public String getSpecialPoints() {
        return String.valueOf(this.mana);
    }

    @Override
    public String toString() {
        return super.toString()
                .concat(String.valueOf(this.mana * this.getLevel()));
    }
}