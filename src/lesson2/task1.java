package lesson2;

import java.io.IOException;
import java.util.logging.*;

public class task1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(task1.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        logger.addHandler(ch);

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);

/*
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
*/

        logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}
