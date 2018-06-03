@GameClass(
        author = "Pesho",
        revision = 3,
        description = "Used for Java OOP Advanced course - Enumerations and Annotations.",
        reviewers = {"Pesho", "Svetlio"})
public class Weapon implements Comparable<Weapon> {

    private String name;

    private int minDamage;

    private int maxDamage;

    private Gem[] sockets;

    public Weapon(WeaponType type, String name) {
        this.name = name;
        this.setStats(type);
    }

    public void addGem(int socketIndex, Gem gem) {
        try {
            this.sockets[socketIndex] = gem;
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }

    public void removeGem(int socketIndex) {
        try {
            this.sockets[socketIndex] = null;
        } catch (ArrayIndexOutOfBoundsException ignored) {}
    }

    @Override
    public String toString() {
        return String.format(
                "%s: %s-%s Damage, +%s Strength, +%s Agility, +%s Vitality",
                this.name, this.getMinDamage(), this.getMaxDamage(),
                this.getStrength(), this.getAgility(), this.getVitality());
    }

    @Override
    public int compareTo(Weapon other) {
        return Double.compare(this.getLevel(), other.getLevel());
    }

    public double getLevel() {
        return ((this.getMinDamage() + this.getMaxDamage()) / 2.0)
                + this.getStrength()
                + this.getAgility()
                + this.getVitality();
    }

    private int getMinDamage() {
        int strengthBonus =
                this.getStrength() * MagicStatType.STRENGTH.getMinDamageMod();
        int agilityBonus =
                this.getAgility() * MagicStatType.AGILITY.getMinDamageMod();
        return this.minDamage + strengthBonus + agilityBonus;
    }

    private int getMaxDamage() {
        int strengthBonus =
                this.getStrength() * MagicStatType.STRENGTH.getMaxDamageMod();
        int agilityBonus =
                this.getAgility() * MagicStatType.AGILITY.getMaxDamageMod();
        return this.maxDamage + strengthBonus + agilityBonus;
    }

    private int getStrength() {
        int total = 0;

        for (Gem gem : this.sockets) {
            if (gem != null) {
                total += gem.getStrength();
            }
        }

        return total;
    }

    private int getAgility() {
        int total = 0;

        for (Gem gem : this.sockets) {
            if (gem != null) {
                total += gem.getAgility();
            }
        }

        return total;
    }

    private int getVitality() {
        int total = 0;

        for (Gem gem : this.sockets) {
            if (gem != null) {
                total += gem.getVitality();
            }
        }

        return total;
    }

    private void setStats(WeaponType type) {
        this.minDamage = type.getMinDamage();
        this.maxDamage = type.getMaxDamage();
        this.sockets = new Gem[type.getSocketsCount()];
    }
}