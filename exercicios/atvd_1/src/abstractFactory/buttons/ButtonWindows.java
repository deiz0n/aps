package abstractFactory.buttons;

import abstractFactory.buttons.Button;

public class ButtonWindows implements Button {

    @Override
    public void click() {
        System.out.println("Button clicked on Windows");
    }
}
