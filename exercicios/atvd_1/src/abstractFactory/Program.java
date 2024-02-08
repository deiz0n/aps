package abstractFactory;

import abstractFactory.buttons.Button;
import abstractFactory.factories.Factory;
import abstractFactory.factories.MacOSFactory;
import abstractFactory.factories.WindowsFactory;
import abstractFactory.windows.Window;

public class Program {

    private Button button;
    private Window window;

    public Program(Factory factory) {
        button = factory.createButtom();
        window = factory.createWindow();
    }

    public void execute() {
        button.click();
        window.open();;
    }

    public static void main(String[] args) {

        Program windows = new Program(new WindowsFactory());
        windows.execute();

        Program macOS = new Program(new MacOSFactory());
        macOS.execute();

    }

}
