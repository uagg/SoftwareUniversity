/*
Учебна зала има правоъгълен размер w на h метра, без колони във вътрешността си. Залата е разделена на две части – лява
и дясна, с коридор приблизително по средата. В лявата и в дясната част има редици с бюра. В задната част на залата има
голяма входна врата. В предната част на залата има катедра с подиум за преподавателя. Едно работно място заема
70 на 120cm (маса с размер 70 на 40 cm + място за стол и преминаване с размер 70 на 80 cm). Коридорът е широк поне
100 cm. Изчислено е, че заради входната врата (която е с отвор 160 cm) се губи точно 1 работно място, а заради
катедрата (която е с размер 160 на 120 cm) се губят точно 2 работни места. Напишете програма, която въвежда размери
на учебната зала и изчислява броя работни места в нея при описаното разположение (вж. фигурата).
Вход
От конзолата се четат 2 числа, по едно на ред: h (дължина в метри) и w (широчина в метри).
Ограничения: 3 ≤ h ≤ w ≤ 100.
Изход
Да се отпечата на конзолата едно цяло число: броят места в учебната зала.

 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double w = Double.parseDouble(scanner.nextLine()); // width in m
        double h = Double.parseDouble(scanner.nextLine()); // height im m
        h= h - 1;
        double workSpaceAreaWidth = w / 1.2;
        workSpaceAreaWidth = Math.floor(workSpaceAreaWidth); // workspace units in width

        double workSpaceAreaHeight = h / 0.7;
        workSpaceAreaHeight = Math.floor(workSpaceAreaHeight); // workspace units in width
        double workSpaceArea = workSpaceAreaHeight * workSpaceAreaWidth; // all workspace units
        System.out.println(workSpaceArea - 3);
    }
}