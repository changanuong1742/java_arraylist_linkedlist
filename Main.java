import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employer employer1 = new Employer(1, "Long", "Quynh hau");
        Employer employer2 = new Employer(2, "Nhi", "Quynh Dien");
        Employer employer3 = new Employer(3, "Minh", "Quynh Giang");

        /*
        ArrayList<Employer> employers = new ArrayList<>();
        employers.add(employer1);
        employers.add(employer2);
        employers.add(employer3);
        for (int i = 0; i < employers.size(); i++) {
            System.out.println(employers.get(i).getId() + " " + employers.get(i).getName() + " " + employers.get(i).getAddress());

        }

         */

    LinkedList<Employer> employers = new LinkedList<>();

    employers.add(employer1);

        for (int i = 0; i < employers.size(); i++) {
            System.out.println(employers.get(i).getId() + " " + employers.get(i).getName() + " " + employers.get(i).getAddress());

        }


    }
}
