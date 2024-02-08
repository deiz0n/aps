package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.ButtonWindows;
import abstractFactory.windows.Window;
import abstractFactory.windows.WindowWindows;

public class WindowsFactory implements Factory {


    @Override
    public Button createButtom() {
        return new ButtonWindows();
    }

    @Override
    public Window createWindow() {
        return new WindowWindows();
    }
}
