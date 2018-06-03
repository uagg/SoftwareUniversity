public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    @Override
    public String toString() {
        String lowLetters = super.name().substring(1).toLowerCase();
        String firstLetter = super.name().substring(0,1);
        String result = firstLetter.concat(lowLetters);
        return result;
    }
}
