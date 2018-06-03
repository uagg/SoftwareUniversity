public abstract class BaseChampion implements Champion {

    private String characterType;
    private String username;
    private Integer level;

    public BaseChampion(String characterType, String username, Integer level) {
        this.characterType = characterType;
        this.username = username;
        this.level = level;
    }

    @Override
    public String getChampionType() {
        return this.characterType;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public Integer getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s%n",
                this.getUsername(),
                this.getHashedPassword(),
                this.getChampionType());
    }
}
