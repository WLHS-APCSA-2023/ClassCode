import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name is "+ name);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Your age is " + age);
        System.out.print("What month were you born in? ");
        String month = input.nextLine();
        System.out.println("You were born in " + month);
        System.out.println("What is the temperature? ");
        double temperature = input.nextDouble();
        System.out.println("The temp is " + temperature);

        age += 1; //compound assignment operator
        System.out.println("Next year you are " + age);

        age++;
        System.out.println("And the year after you are " + age);

        age += 10;
        System.out.println("10 years after that you are " + age);

        age--;
        System.out.println("The year before you were " + age);

        age -= 5;
        System.out.print("5 years before you were " + age);
        
        /*VS Code gives an error saying input is not closed. It is best practice not to close the System.in scanner.
         * This is because if you close it, you will be prevented from getting keyboard input in the future without
         * terminating and restarting the program. This is because in is a static method of the System class and 
         * belongs to all Scanner instances and closing it closes all of them. See 
         * https://www.reddit.com/r/learnjava/comments/ldas7s/to_close_the_scanner_or_not_close_the_scanner/gm4vpkj/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button
         * for a much more technical discussion.
         */
    }
}
