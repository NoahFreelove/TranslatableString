import java.util.Scanner;

public final class QuickScan {
    public static String get(String message){
        return get(message,true);
    }
    public static String get(String message, boolean printLn){
        if(printLn)
            System.out.println(message);
        else
            System.out.print(message);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        return input;
    }
}
