package factoryMethod.types;

import factoryMethod.factories.ILog;

public class LogBancoDeDados implements ILog {

    @Override
    public void registar(String msg) {
        System.out.printf("Random commit database %s.", msg);
    }
}
