public class Chicken {
    private String name;
    private int age;

    public Chicken(String inputName, int inputAge) {
        this.setName(inputName);
        this.setAge(inputAge);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.isEmpty() || name.trim().length() == 0) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if((age < 0) || (age > 15)) {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    public double getProductPerDay() {
        return this.calculateProductPerDay();
    }

    private double calculateProductPerDay() {
        switch (this.age) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 1.5;
            case 4:
            case 5:
            case 6:
            case 7:
                return 2;
            case 8:
            case 9:
            case 10:
            case 11:
                return 1;
            default:
                return 0.75;
        }
    }
}
