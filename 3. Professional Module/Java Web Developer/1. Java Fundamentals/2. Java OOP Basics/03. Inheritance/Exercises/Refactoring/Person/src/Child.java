public class Child extends Person {

    public Child(String inputName, int inputAge) {
        super(inputName, inputAge);
    }

    @Override
    void setAge(int inputAge) {
        if(inputAge > 15) {
            throw new IllegalArgumentException("Child's age must be lesser than 15!");
        }
        super.setAge(inputAge);
    }
}
