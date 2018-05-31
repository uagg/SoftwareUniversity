/*
Басейн с обем V има две тръби от които се пълни. Всяка тръба има определен дебит (литрите вода минаващи през една
тръба за един час). Работникът пуска тръбите едновременно и излиза за N часа. Напишете програма, която изкарва
състоянието на басейна, в момента, когато работникът се върне.
Вход
От конзолата се четат четири реда:
•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – число с плаваща запетая в интервала [1.0…24.00]
Изход
Да се отпечата на конзолата едно от двете възможни състояния:
•	До колко се е запълнил басейна и коя тръба с колко процента е допринесла. Всички проценти се свеждат до цяло число
 (без закръгляне).
o	"The pool is [x]% full. Pipe 1: [y]%. Pipe 2: [z]%."
•	Aко басейнът се е препълнил – с колко литра е прелял за даденото време, число с плаваща запетая
o	"For [x] hours the pool overflows with [y] liters."
* Имайте предвид, че поради свеждането до цяло число се губят данни и нормално сборът на процентите да е 99%, а не 100%.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int volume = Integer.parseInt(console.nextLine());
        int debit1 = Integer.parseInt(console.nextLine());
        int debit2 = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());
        double pipe1Volume = hours * debit1;
        double pipe2Volume = hours * debit2;
        double fullVolume = pipe1Volume + pipe2Volume;
        DecimalFormat df = new DecimalFormat("0.##");

        if (volume >= fullVolume){
            double fullPercent = Math.floor(fullVolume / volume * 100);
            double pipe1Percent = Math.floor(pipe1Volume / fullVolume * 100);
            double pipe2Percent = Math.floor(pipe2Volume / fullVolume * 100);

            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.\n", fullPercent, pipe1Percent, pipe2Percent);
        } else {
            double overVolume = fullVolume - volume;

            System.out.printf("For %s hours the pool overflows with %.1f liters.\n", df.format(hours), overVolume);
        }
    }
}