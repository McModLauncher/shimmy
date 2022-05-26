package org.mcmodlauncher.shimmy.l4jtests;

import org.junit.jupiter.api.Test;
import org.mcmodlauncher.shimmy.Level;
import org.mcmodlauncher.shimmy.LogFactory;

public class Log4JTest {
    @Test
    void testLog4J() {
        var lf = new LogFactory("log4j");
        lf.getLogger("HELLO").log(Level.FATAL, "Hello {}", ()->"CHEESE");
    }
}
