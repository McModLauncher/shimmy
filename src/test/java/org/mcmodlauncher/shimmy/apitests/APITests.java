package org.mcmodlauncher.shimmy.apitests;

import org.junit.jupiter.api.Test;
import org.mcmodlauncher.shimmy.Level;
import org.mcmodlauncher.shimmy.LogFactory;

public class APITests {
    @Test
    void testAPI() {
        LogFactory lf = new LogFactory("test");
        lf.getLogger("test").log(Level.INFO, "Hello", ()->"CHEESE", ()->"PEETTER");
    }
}
