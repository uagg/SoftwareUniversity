public class Smartphone implements Phone, Browser {

    @Override
    public String browse(String url) {

        for (Character c : url.toCharArray()) {
            if (Character.isDigit(c)) {
                return "Invalid URL!";
            }
        }
        return "Browsing: " + url + "!";
    }

    @Override
    public String call(String number) {

        for (Character c : number.toCharArray()) {
            if (!Character.isDigit(c)) {
                return "Invalid number!";
            }
        }
        return "Calling... " + number;
    }
}
