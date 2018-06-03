import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeamPlayers;
    private List<Person> reserveTeamPlayers;

    public Team(String inputName) {
        this.setName(inputName);
        this.firstTeamPlayers = new ArrayList<>();
        this.reserveTeamPlayers = new ArrayList<>();
    }

    private void setName(String inputName) {
        this.name = inputName;
    }

    public Collection<Person> getFirstTeam() {
        return Collections.unmodifiableList(firstTeamPlayers);
    }

    public Collection<Person> getReserveTeam() {
        return Collections.unmodifiableList(reserveTeamPlayers);
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            this.firstTeamPlayers.add(person);
        } else {
            this.reserveTeamPlayers.add(person);
        }
    }


}
