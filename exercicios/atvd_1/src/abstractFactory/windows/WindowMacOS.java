package abstractFactory.windows;

import abstractFactory.windows.Window;

public class WindowMacOS implements Window {

    @Override
    public void open() {
        System.out.println("Open window on MacOS");
    }
}
