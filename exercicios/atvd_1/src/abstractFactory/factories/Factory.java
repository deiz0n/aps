package abstractFactory.factories;

import abstractFactory.buttons.Button;
import abstractFactory.windows.Window;

public interface Factory {

    Button createButtom();
    Window createWindow();

}
