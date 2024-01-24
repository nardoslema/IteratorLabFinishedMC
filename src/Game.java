//Nardos Lemma
//lab 05
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Game {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 12; i++) {
            int number;
            number = random.nextInt(90) + 10;
            numbers.add(number);
        }
        System.out.println("current values are " + numbers);
        int current;
        boolean takeOut = false;
        do {
            Iterator<Integer> iterator = numbers.listIterator();
            Iterator<Integer> iterator2 = numbers.listIterator(1);
                while (iterator.hasNext()) {
                    current = iterator.next();
                    if (iterator2.hasNext()) {
                        int next = iterator.next();

                        if ((current / 10 )== (next / 10) || (current % 10 )== (next % 10)) {
                            iterator.remove();
                            iterator.remove();
                            takeOut = true;

                        }
                    }
                }
            }
            while (takeOut);

            if (numbers.size() == 0) {
                System.out.println("Congrats you won!");
            } else {
                System.out.println("You have lost, try again");
            }
        }
    }



