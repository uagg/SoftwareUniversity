    public class Student extends Human {
    private String facultyNumber;

    Student(String inputFirstName, String inputLastName, String inputFacultyNumber) {
        super(inputFirstName, inputLastName);
        this.setFacultyNumber(inputFacultyNumber);
    }

    private void setFacultyNumber(String inputFacultyNumber) {

        if((inputFacultyNumber.length() < 5) || (inputFacultyNumber.length() > 10)) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }

        this.facultyNumber = inputFacultyNumber;
    }

    private String getFacultyNumber() {
        return this.facultyNumber;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s%nLast Name: %s%nFaculty number: %s%n",
                super.getFirstName(), super.getLastName(), this.getFacultyNumber());
    }
}
