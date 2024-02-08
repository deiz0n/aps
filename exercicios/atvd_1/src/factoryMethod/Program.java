package factoryMethod;

import factoryMethod.factories.LogFactory;

public class Program {

    public static void main(String[] args) {
        var log = LogFactory.createLog("database");
        log.registar("Message test");
    }

}
