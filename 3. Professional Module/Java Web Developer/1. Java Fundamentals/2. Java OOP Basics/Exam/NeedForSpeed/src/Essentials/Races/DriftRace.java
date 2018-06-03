package Essentials.Races;

import java.util.ArrayList;

public class DriftRace extends Race {

    public DriftRace(int inputLength, String inputRoute, int inputPrizePool) {
        super(inputLength, inputRoute, inputPrizePool);
        super.participants = new ArrayList<>();
    }
}
