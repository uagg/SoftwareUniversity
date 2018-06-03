class Room {

    private Pet pet;

    void setPet(Pet pet) {
        this.pet = pet;
    }

    Boolean isEmpty() {
        return this.pet == null;
    }

    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "Room empty";
        }
        return this.pet.toString();
    }
}