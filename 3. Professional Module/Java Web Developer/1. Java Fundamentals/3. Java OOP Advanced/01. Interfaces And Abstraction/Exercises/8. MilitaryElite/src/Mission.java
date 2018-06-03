public class Mission implements IMission {

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.codeName = codeName;
        this.setState(state);
    }

    private void setState(String state) {

        switch (state) {
            case IMission.STATE_FINISHED:
            case IMission.STATE_IN_PROGRESS:
                this.state = state;
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public void completeMission() {
        this.state = IMission.STATE_FINISHED;
    }

    @Override
    public String toString() {
        return String.format("Code Name: %s State: %s",
                this.getCodeName(),
                this.getState());
    }
}