public class Human {

    private String firstName;
    private String lastName;

    Human(String inputFirstName, String inputLastName) {
        this.setFirstName(inputFirstName);
        this.setLastName(inputLastName);
    }

    private void setFirstName(String inputFirstName) {
        if(!Character.isUpperCase(inputFirstName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument:firstName");
        } else if(!(inputFirstName.length() >= 4)) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument:firstName");
        }
        this.firstName = inputFirstName;
    }

    void setLastName(String inputLastName) {
        if(!Character.isUpperCase(inputLastName.charAt(0))) {
            throw new IllegalArgumentException("Expected upper case letter!Argument:lastName");
        } else if(!(inputLastName.length() >= 4)) {
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument:lastName");
        }
        this.lastName = inputLastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}
