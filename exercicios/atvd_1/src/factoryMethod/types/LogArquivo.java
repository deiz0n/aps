package factoryMethod.types;

import factoryMethod.factories.ILog;

public class LogArquivo implements ILog {

    @Override
    public void registar(String msg) {
        System.out.printf("Random file %s.", msg);
    }
}
