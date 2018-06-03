public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930, "Dorothy Sayers", "Robert Eustace");

        if (bookOne.compareTo(bookTwo) > 0) {
            System.out.println(String.format("%s with title: %s is before %s with title: %s", bookOne, bookOne.getTitle(), bookTwo, bookTwo.getTitle()));
        } else if (bookOne.compareTo(bookTwo) < 0) {
            System.out.println(String.format("%s with title: %s is before %s with title: %s", bookTwo, bookTwo.getTitle(), bookOne, bookOne.getTitle()));
        } else {
            System.out.println("Book are equal");
        }
    }
}
