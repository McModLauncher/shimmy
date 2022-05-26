module shimmy.test {
    requires org.mcmodlauncher.shimmy;
    requires org.junit.jupiter.api;
    requires java.logging;
    exports org.mcmodlauncher.shimmy.apitests;
    exports org.mcmodlauncher.shimmy.jultest;
    opens org.mcmodlauncher.shimmy.apitests;
    opens org.mcmodlauncher.shimmy.jultest;
    provides org.mcmodlauncher.shimmy.LogShimProvider with org.mcmodlauncher.shimmy.apitests.TestLogShimProvider, org.mcmodlauncher.shimmy.jultest.JULShimProvider;
}