package abstractFactory.buttons;

public class ButtonMacOS implements Button {

    @Override
    public void click() {
        System.out.println("Button clicked on MacOS");
    }
}
