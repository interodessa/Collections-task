package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Make a choice:\n1) Print all users\n2) Print one user");
        int choice = scanner.nextInt();
        DataProvider dataProvider = new DataProvider();
        switch (choice){
            case 1: new OutputData().Outputter(dataProvider.getData());
                break;
            case 2:
                System.out.println("input number from the list");
                choice = scanner.nextInt();
                new OutputData().Outputter(choice, dataProvider.getData());
                break;
        }
    }
}
