import java.util.Scanner;

/**
 * Asks the user questions, does some math, prints out some cool facts and lyrics
 * @version 09/17/2025
 * @author toanshdesai
 * Flint session here: https://app.flintk12.com/chats/2dc3a1b4-dd8b-4602-8c22-fd8936b52337
 */
public class SimpleIOMath {
    private String name;
    private int age;
    private int favNumber;

    /**
     * Ask the user questions
     */
    public void promptUser() {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Scanner in3 = new Scanner(System.in);
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();

        while (true) {
            try {
                System.out.print("Question 2: How old are you? ");
                age = Integer.parseInt(in2.nextLine().replaceAll("\\s+",""));
                if (age<=0){
                    System.out.println("Invalid input");
                    continue;
                }
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
        while (true) {
            try {
                System.out.print("Question 3: What is your favorite number? ");
                favNumber = Integer.parseInt(in3.nextLine().replaceAll("\\s+",""));
                break;
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int firstPrimeFactor() {
        for  (int i = 2; i <= Math.sqrt(age); i++) {
            if (isPrime(i) && age%i==0) {
                return i;
            }
        }
        return age;
    }

    /**
     * Summarize the conversation
     */
    public void printInfo() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
        Thread.sleep(4500);
        System.out.println("Your name is: "+name);
        Thread.sleep(1000);
        System.out.println("Your age is: "+age);
        Thread.sleep(1000);
        System.out.println("At your next birthday, you will turn "+(age+1));
        Thread.sleep(1000);
        System.out.println("The first prime factor of "+age+" is: "+firstPrimeFactor());
        Thread.sleep(1000);
        System.out.println("Your favorite number is: "+favNumber);
        Thread.sleep(1000);
        System.out.println("Your favorite number squared is: "+(int)(Math.pow(favNumber,2)));
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command line arguments, if needed
     */
    public static void main(String[] args) throws InterruptedException {
        SimpleIOMath app = new SimpleIOMath();
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        app.promptUser();
        app.printInfo();
        System.out.println("* end of program *");
    }
}
