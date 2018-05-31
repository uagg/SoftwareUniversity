/*
Напишете Java конзолна програма, която отпечатва триъгълник от 55 звездички, разположени на 10 реда:
*
**
***
****
*****
******
*******
********
*********
**********
*/
public class Main {
    public static void main(String[] args) {

        String star = "*";

        for(int i = 0; i < 10; i++) {
            System.out.println(star);
            star = star + "*";
        }
    }
}