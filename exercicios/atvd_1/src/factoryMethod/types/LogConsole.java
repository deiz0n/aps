package factoryMethod.types;

import factoryMethod.factories.ILog;

public class LogConsole implements ILog {

    @Override
    public void registar(String msg) {
        System.out.printf("Random message console %s.", msg);
    }
}
