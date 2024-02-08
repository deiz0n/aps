package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.buttons.ButtonMacOS;
import abstractFactory.windows.Window;
import abstractFactory.windows.WindowMacOS;

public class MacOSFactory implements Factory {


    @Override
    public Button createButtom() {
        return new ButtonMacOS();
    }

    @Override
    public Window createWindow() {
        return new WindowMacOS();
    }
}
