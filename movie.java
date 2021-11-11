import java.util.*;

public class movie {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue movies = new LinkedList();
        Queue snack = new LinkedList();
        for (int i = 0; i < 3; i++) {
            int ii = i + 1;
            System.out.print("Enter movie " + ii + " of 3: ");
            movies.offer(s.nextLine());
        }
        for (int x = 0; x < 3; x++) {
            int xx = x + 1;
            System.out.print("Enter snack " + xx + " of 3: ");
            snack.offer(s.nextLine());
        }
        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are " + snack);
        System.out.println("\n" + "Press 'S' each time you finish a snack.");

        do {
            String user = s.nextLine();
            if (user.equalsIgnoreCase("S")) {
                snack.poll();
                if (!snack.isEmpty()) {
                    System.out.println("Snacks remaining are " + "("+snack+")");
                } else if (!user.equalsIgnoreCase("S")) {
                    System.out.println("Invalid Letter, try again");
                }
            }
        } while (!snack.isEmpty());
        System.out.println("No more snack");
    }
}
