package Essentials.Races;

import java.util.ArrayList;

public class CasualRace extends Race {
    public CasualRace(int inputLength, String inputRoute, int inputPrizePool) {
        super(inputLength, inputRoute, inputPrizePool);
        super.participants = new ArrayList<>();
    }
}
