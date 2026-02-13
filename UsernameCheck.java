import java.util.Scanner;
public class ZerTesting
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String username = "";

        while(username.isEmpty()){
            System.out.println("Please Enter an Username: ");
            username = scanner.nextLine();
        }

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username should be between 4-12 Characters!");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username should not contain spaces or underscores!");
        }
        else{
            System.out.printf("Welcome, %s!", username);
        }
        
        scanner.close();
    }
}
