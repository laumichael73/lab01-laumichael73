import java.util.Scanner; // auto-import

import static java.lang.Integer.parseInt;

public class Driver {
    boolean session;

    public Driver() {
        session = false;
    }

    private void createSession() {
        session = true;
        runSession();
    }

    private void runSession() {
        int action;
        Scanner sc = new Scanner(System.in);
        Manager m = new Manager(20);
        System.out.println("Welcome to my program.\nEnter commands or type 'help' for more instructions.");
        while (session) {
            // get text input from user
            String input = sc.nextLine();

            // split text into array
            String[] cmd = input.split(" ", 0);

            // determine command
            //0 = help
            //1 = exit
            //2 = save
            //3 = list
            //4 = query
            //-1 = error
            if (cmd[0].equals("help")) {
                action = 0;
            } else if (cmd[0].equals("exit")) {
                action = 1;
            } else if (cmd[0].equals("save")) {
                action = 2;
            } else if (cmd[0].equals("list")) {
                action = 3;
            } else if (cmd[0].equals("query")) {
                action = 4;
            } else {
                action = -1;
                System.err.println("Error: unimplemented command");
            }
            // execute command
            if (action == 0) //help
            {
                System.out.println("exit: exit the program\nsave: enter a new product\nlist: return a list of product\nquery: look up product info");
            } else if (action == 1) { //exit
                session = false;
            } else if (action == 2) { //save
                if (cmd.length == 2)
                    m.addProduct(new Product(cmd[1]));
                else if (cmd.length == 3)
                    m.addProduct(new Product(cmd[1], parseInt(cmd[2])));
            } else if (action == 3) { //list
                for (int i = 0; i < m.length(); i++) {
                    System.out.println("" + (i + 1) + ". " + m.getProduct(i).toString());
                }
            } else if (action == 4) { //query
                System.out.println(m.query(cmd[1]).toString());
            }
        }
    }

    public static void main(String[] args) {
        Driver d = new Driver();
        d.createSession();
    }
}