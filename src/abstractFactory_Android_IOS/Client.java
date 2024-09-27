package abstractFactory_Android_IOS;

import java.util.Scanner;

public class Client {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String platform = scanner.nextLine();
        Platform p = Platform.createPlatform(platform);
        UIComponentFactory componentFactory = p.createUIComponent();
        Button button = componentFactory.createButton();
        button.draw();
        
    }
}
