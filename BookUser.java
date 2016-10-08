import java.util.Scanner;

/**
 * Created by Trayvont on 10/8/2016.
 */
public class BookUser {
    public char choice;
    public String name;
    public String birthYear;
    public boolean cont;
    public String token;
    public Scanner input;
    //public Scanner OutputSteam.... Something to write to text file

    public BookUser() {
        System.out.println("Hello! Thank you for executing this program. What would you like to do? - (Enter \\'H\\' if this is your first time)\\n");
        System.out.print("Option: ");
        input = new Scanner(System.in);
        choice = input.next().charAt(0);
    }
    public void options(char x){
        System.out.println();
        switch (x){
            case 'H':
            case 'h':
                System.out.println("You have asked for help. Here is a list of the options this program can perform for you:\n");
                System.out.print("(P) - Provide your information for us to store locally.\n");
                System.out.println("(Q) - Quit and end the application.\n");
                x = input.next().charAt(0);
                break;

            case 'P':
            case 'p':
                System.out.println("Great! Now, provide your name and birth year and we will set aside your local file\nName: ");
                do{
                    name = input.next();
                    System.out.println("Your name is " + name + ". Enter \'0\' to change, or any key to continue.\n");
                    break; //cont = input.next();
                }while(cont == true);
                do{
                    System.out.print("Birth Year: ");
                    birthYear = input.next();
                    System.out.println("Your birth year is " + birthYear + ". Enter \'0\' to change, or any key to continue.\n");
                    break; //cont = input.next();
                }while(!cont);

                token = birthYear+name;
                /*
                * file open
                * System.out.println(name + "\'s file!\n\n" + name + "\t" + birthYear + "END");
                * close file
                *
                * */

                System.out.print("Enter choice: ");
                x = input.next().charAt(0);
                options(x);
                break;

            case 'Q':
            case 'q':
                System.out.print("(Q) - Quit and end the application: Are you sure?\n\n(Y\\N) ");
                x = input.next().charAt(0);
                while(x != 'y' || x != 'Y' || x != 'n' || x != 'N') {
                    System.out.print("\n" + x + " is wrong. Enter Y or N: ");
                    x = input.next().charAt(0);
                    if (x == 'Y' || x == 'y' || x == 'N' || x == 'n') {
                        break;
                    }
                }
                if(x == 'Y' || x == 'y'){
                    System.out.print("Exiting...\n\n");
                    System.exit(0);
                }else{
                    System.out.print("Alright, which option would you like? Remember \'H\': ");
                    x = input.next().charAt(0);
                    options(x);
                }


            default:
                System.out.println("Sorry, \'" + x + "\' is not a valid option\n\nIf you would like to exit enter \'Q\', or any other key to try again.\n");
                x = input.next().charAt(0);
                options(x);
        }
        return;
    }
    public char getChoice(){
        return this.choice;
    }

}
