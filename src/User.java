import java.util.Scanner;
import java.util.Vector;

public class User {
    String userType;
    String username;
    String password;
    Vector<Bill> bills;
    Vector<Credit> credits;
    double creditScore;

    public void setUserType(String userType) {
        switch (userType) {
            case "Banker":
                this.userType = "Banker";
                break;
            case "User":
                this.userType = "User";
                break;
            default:
                do {
                    System.out.println("Not a valid user type");
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter the type here: ");
                    userType = scanner.nextLine();
                } while (!userType.equals("User") && !userType.equals("Banker"));

                break;
        }
    }

    public String getUserType() {
        return this.userType;
    }

    public void setUsername(String username, Management management) {
        for (int index = 0; index < management.users.size(); index++) {
            if (username.equals(management.users.get(index).getUsername())) {
                do {
                    System.out.println("The username already exists");
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter another username here:");
                    username = scanner.nextLine();
                } while (username.equals(management.users.get(index).getUsername()));
            }
            this.username = username;
        }
    }
    public String getUsername() {
        return this.username;
    }

    public void setPassword() {

    }

    public String getPassword() {
        return this.password;
    }
}
