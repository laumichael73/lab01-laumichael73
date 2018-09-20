import java.util.Scanner; // auto-import

public class Driver
{
  boolean session;
  
  public Driver()
  {
    session = false;
  }
  
  private void createSession() {
    session = true;
    runSession();
  }
  
  private void runSession() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to my program.\nEnter commands or type 'help' for more instructions.");
    while (session)
    {
      // get text input from user
      String[] cmd = sc.nextLine().split(" ", 0);
      if (cmd[0].equals("help"))
      {
        System.out.println("exit: exit the program\nsave: enter a new product\nquery: look up product info");
      }
      System.out.println(cmd);
      // split text into array
      // determine command
      // execute command
      session = false;
    }
  }
  
  public static void main(String[] args) {
    Driver d = new Driver();
    d.createSession();
  }
}