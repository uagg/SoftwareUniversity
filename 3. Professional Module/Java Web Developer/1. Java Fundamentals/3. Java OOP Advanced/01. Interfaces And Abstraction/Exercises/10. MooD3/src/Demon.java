public class Demon extends BaseChampion implements Champion {

    public static final String TYPE = "Demon";

    private Double energy;

    public Demon(String username, Integer level, Double energy) {
        super(Demon.TYPE, username, level);
        this.energy = energy;
    }

    @Override
    public String getHashedPassword() {
        return String.valueOf(this.getUsername().length() * 217);
    }

    @Override
    public String getSpecialPoints() {
        return String.valueOf(this.energy);
    }

    @Override
    public String toString() {
        return super.toString()
                .concat(String.valueOf(this.energy * this.getLevel()));
    }
}