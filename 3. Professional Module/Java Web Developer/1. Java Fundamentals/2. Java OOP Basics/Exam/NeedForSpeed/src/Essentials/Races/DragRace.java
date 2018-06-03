package Essentials.Races;

import java.util.ArrayList;

public class DragRace extends Race {

    public DragRace(int inputLength, String inputRoute, int inputPrizePool) {
        super(inputLength, inputRoute, inputPrizePool);
        super.participants = new ArrayList<>();
    }
}
