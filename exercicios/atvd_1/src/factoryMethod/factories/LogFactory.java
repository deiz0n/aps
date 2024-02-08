package factoryMethod.factories;

import factoryMethod.factories.ILog;
import factoryMethod.types.LogArquivo;
import factoryMethod.types.LogBancoDeDados;
import factoryMethod.types.LogConsole;

public class LogFactory {

    public static ILog createLog(String type) {
        if (type.equals("file")) return new LogArquivo();
        else if (type.equals("database")) return new LogBancoDeDados();
        else return new LogConsole();
    }

}
