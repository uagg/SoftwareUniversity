public class Clinic {

    private String name;
    private Room[] rooms;
    private int center;

    public Clinic(String name, int numberOfRooms) {

        this.setRooms(numberOfRooms);
        this.setCenter();
        this.name = name;
    }

    public void print() {
        StringBuilder output = new StringBuilder();
        for (Room room : this.rooms) {
            output.append(room.toString()).append(System.lineSeparator());
        }
        System.out.println(output.toString().trim());
    }

    public void print(int roomNumber) {
        System.out.println(this.rooms[roomNumber].toString());
    }

    public boolean hasEmptyRooms() {
        for (Room room : this.rooms) {
            if (room.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Pet pet) {
        if (this.rooms[center].isEmpty()) {

            this.rooms[center].setPet(pet);
            return true;

        } else {

            int offset = 1;

            while (true) {
                int left = this.center - offset;
                int right = this.center + offset;

                if (left < 0 || right >= this.rooms.length) {
                    return false;
                }

                if (this.rooms[left].isEmpty()) {
                    this.rooms[left].setPet(pet);
                    return true;
                }

                if (this.rooms[right].isEmpty()) {
                    this.rooms[right].setPet(pet);
                    return true;
                }

                offset += 1;
            }
        }
    }

    public boolean release() {
        if (! this.rooms[center].isEmpty()) {

            this.rooms[center].setPet(null);
            return true;

        } else {

            int offset = 1;

            boolean movingRight = true;

            while (true) {

                if (movingRight) {

                    if (offset >= this.rooms.length) {
                        movingRight = false;
                        offset = 0;
                        continue;
                    }

                    int target = this.center + offset;

                    if (! this.rooms[target].isEmpty()) {
                        this.rooms[target].setPet(null);
                        return true;
                    }

                    offset += 1;

                } else {

                    if (offset == this.center) {
                        return false;
                    }

                    if (! this.rooms[offset].isEmpty()) {
                        this.rooms[offset].setPet(null);
                        return true;
                    }

                    offset += 1;
                }
            }
        }
    }

    private void setCenter() {
        if (this.rooms.length == 1) {
            this.center = 0;
        } else {
            this.center = this.rooms.length / 2;
        }
    }

    private void setRooms(int numberOfRooms) {
        if (numberOfRooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }

        this.rooms = new Room[numberOfRooms];
        for (int i = 0; i < this.rooms.length; i++) {
            this.rooms[i] = new Room();
        }
    }
}