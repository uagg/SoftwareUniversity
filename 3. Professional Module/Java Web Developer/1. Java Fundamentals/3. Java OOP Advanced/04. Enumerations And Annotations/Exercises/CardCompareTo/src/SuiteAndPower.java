public enum SuiteAndPower {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int max;

    SuiteAndPower(int i) {
        this.max = i;
    }

    public int getMax() {
        return this.max;
    }
}
