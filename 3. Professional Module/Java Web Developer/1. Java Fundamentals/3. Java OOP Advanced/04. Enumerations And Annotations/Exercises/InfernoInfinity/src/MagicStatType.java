public enum MagicStatType {
    STRENGTH(2, 3),
    AGILITY(1, 4),
    VITALITY(0, 0);

    private int minDamageMod;
    private int maxDamageMod;

    MagicStatType(int minDamageMod, int maxDamageMod) {
        this.minDamageMod = minDamageMod;
        this.maxDamageMod = maxDamageMod;
    }

    public int getMinDamageMod() {
        return this.minDamageMod;
    }

    public int getMaxDamageMod() {
        return this.maxDamageMod;
    }
}