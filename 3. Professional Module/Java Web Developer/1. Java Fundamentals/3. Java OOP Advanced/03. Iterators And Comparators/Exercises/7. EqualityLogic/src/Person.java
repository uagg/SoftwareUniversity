public class Person implements Comparable<Person>{

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode()
                + String.valueOf(this.getAge() + "asd").hashCode();
    }

    @Override
    public int compareTo(Person otherPerson) {
        int nameResult = this.getName().compareTo(otherPerson.getName());
        int ageResult = Integer.compare(this.getAge(), otherPerson.getAge());

        if (nameResult == 0) {
            return ageResult;
        }

        return nameResult;
    }
}
