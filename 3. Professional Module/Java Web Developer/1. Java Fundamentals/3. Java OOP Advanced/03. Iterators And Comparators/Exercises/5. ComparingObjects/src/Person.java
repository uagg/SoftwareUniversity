public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private String town;

    public Person(String name, int age, String town) {
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int nameResult = this.getName().compareTo(otherPerson.getName());
        int ageResult = Integer.compare(this.getAge(), otherPerson.getAge());
        int townResult = this.getTown().compareTo(otherPerson.getTown());

        if (nameResult == 0) {
            if (ageResult == 0) {
                return townResult;
            }

            return ageResult;
        }

        return nameResult;
    }
}
