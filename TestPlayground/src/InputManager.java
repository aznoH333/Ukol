import java.util.Scanner;

public enum InputManager {
    INSTANCE;

    private String output = "";

    private Scanner sc = new Scanner(System.in);

    public void newInput(){
        output = sc.nextLine();
    }
    public String getOutput(){
        return output;
    }
}
