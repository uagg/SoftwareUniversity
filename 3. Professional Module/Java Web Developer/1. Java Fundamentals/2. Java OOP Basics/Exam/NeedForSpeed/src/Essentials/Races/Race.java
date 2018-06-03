package Essentials.Races;

import Essentials.Cars.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Race {
    private int length;
    private String route;
    private int prizePool;
    List<Car> participants;

    public Race(int inputLength, String inputRoute, int inputPrizePool) {
        this.setLength(inputLength);
        this.setRoute(inputRoute);
        this.setPrizePool(inputPrizePool);
        this.participants = new ArrayList<>();
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRoute() {
        return this.route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getPrizePool() {
        return this.prizePool;
    }

    public void setPrizePool(int prizePool) {
        this.prizePool = prizePool;
    }

    public List<Car> getParticipants() {
        return Collections.unmodifiableList(participants);
    }

    public void setParticipants(List<Car> participants) {
        this.participants = participants;
    }
}