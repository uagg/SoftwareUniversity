package p01;

public class Human {
    private String fName;
    private String lName;

    public Human(String fName, String lName) {
        this.setfName(fName);
        this.setlName(lName);
    }

    protected String getfName() {
        return fName;
    }

    public void setfName(String fName) {

        if(Character.isLowerCase(fName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
        }
        if(fName.length()<4){
            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
        }
        this.fName = fName;
    }

    protected String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        if(Character.isLowerCase(lName.charAt(0))){
            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
        }
        if(lName.length()<3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        this.lName = lName;
    }
}

//public class Human {
//
//    private String firstName;
//    private String lastName;
//
//    public Human(String firstName, String lastName) {
//        this.setFirstName(firstName);
//        this.setLastName(lastName);
//    }
//
//    public String getFirstName() {
//        return this.firstName;
//    }
//
//    protected void setFirstName(String firstName) {
//        if (!Character.isUpperCase(firstName.charAt(0))) {
//            throw new IllegalArgumentException("Expected upper case letter!Argument: firstName");
//        }
//
//        if (firstName.length() < 4) {
//            throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName");
//        }
//
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return this.lastName;
//    }
//
//    protected void setLastName(String lastName) {
//        if (!Character.isUpperCase(firstName.charAt(0))) {
//            throw new IllegalArgumentException("Expected upper case letter!Argument: lastName");
//        }
//        if (firstName.length() < 3) {
//            throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName");
//        }
//        this.lastName = lastName;
//    }
//}
