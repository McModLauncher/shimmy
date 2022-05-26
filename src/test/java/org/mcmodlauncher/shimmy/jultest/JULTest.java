package org.mcmodlauncher.shimmy.jultest;

import org.junit.jupiter.api.Test;
import org.mcmodlauncher.shimmy.Level;
import org.mcmodlauncher.shimmy.LogFactory;

public class JULTest {
    @Test
    void testJUL() {
        var lf = new LogFactory("jul");
        lf.getLogger("").log(Level.INFO, "HELLO {0}", "FISH");
    }
}
