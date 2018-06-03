public interface IMission {

    String STATE_IN_PROGRESS = "inProgress";
    String STATE_FINISHED = "Finished";

    String getCodeName();

    String getState();

    void completeMission();
}