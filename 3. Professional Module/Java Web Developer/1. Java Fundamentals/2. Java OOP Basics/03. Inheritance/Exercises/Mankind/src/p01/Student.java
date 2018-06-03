package p01;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student extends Human{
    private String facNum;

    private boolean IsNumberInvalid(String value) {
        boolean isNumberInvalid = false;

        String numberPattern = "^([0-9a-zA-Z]{5,10})$";

        Pattern r = Pattern.compile(numberPattern);

        Matcher m = r.matcher(value);

        if (m.find()) {
            return isNumberInvalid;
        }


        return !isNumberInvalid;
    }


    public Student(String fName, String lName,String facNum) {
        super(fName, lName);
        this.setFacNum(facNum);
    }

    public void setFacNum(String facNum) {

        if(IsNumberInvalid(facNum)){
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facNum = facNum;
    }

    @Override
    public String toString() {
        return String.format(Locale.ROOT,"First Name: %s\n" +
                "Last Name: %s\n" +
                "Faculty number: %s\n",super.getfName(),super.getlName(),this.facNum);
    }
}

//public class Student extends Human {
//
//    private String facultyNumber;
//
//    private boolean IsNumberInvalid(String value) {
//        boolean isNumberInvalid = false;
//
//        String numberPattern = "^([0-9a-zA-Z]{5,10})$";
//
//        Pattern r = Pattern.compile(numberPattern);
//
//        Matcher m = r.matcher(value);
//
//        if (m.find()) {
//            return isNumberInvalid;
//        }
//
//
//        return !isNumberInvalid;
//    }
//
//    public Student(String firstName, String lastName, String facultyNumber) {
//        super(firstName, lastName);
//        this.setFacultyNumber(facultyNumber);
//    }
//
//    protected String getFacultyNumber() {
//        return this.facultyNumber;
//    }
//
//    protected void setFacultyNumber(String facultyNumber) {
//        if (IsNumberInvalid(facultyNumber)) {
//            throw new IllegalArgumentException("Invalid faculty number!");
//        }
//
//        this.facultyNumber = facultyNumber;
//    }
//
//    @Override
//    public String toString() {
//        return String.format(Locale.ROOT,"First Name: %s\n" +
//                "Last Name: %s\n" +
//                "Faculty number: %s\n",super.getFirstName(),super.getLastName(),this.getFacultyNumber());
//    }
//}
