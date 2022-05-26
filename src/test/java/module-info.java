module shimmy.test {
    requires org.mcmodlauncher.shimmy;
    requires org.junit.jupiter.api;
    requires java.logging;
    requires org.mcmodlauncher.shimmy.log4j;
    requires org.apache.logging.log4j;
    exports org.mcmodlauncher.shimmy.apitests;
    exports org.mcmodlauncher.shimmy.jultest;
    exports org.mcmodlauncher.shimmy.l4jtests;
    opens org.mcmodlauncher.shimmy.apitests;
    opens org.mcmodlauncher.shimmy.jultest;
    opens org.mcmodlauncher.shimmy.l4jtests;
    provides org.mcmodlauncher.shimmy.LogShimProvider with org.mcmodlauncher.shimmy.apitests.TestLogShimProvider, org.mcmodlauncher.shimmy.jultest.JULShimProvider;
}