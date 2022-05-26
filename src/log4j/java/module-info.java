module org.mcmodlauncher.shimmy.log4j {
    requires org.mcmodlauncher.shimmy;
    requires org.apache.logging.log4j;
    exports org.mcmodlauncher.shimmy.log4j;
    provides org.mcmodlauncher.shimmy.LogShimProvider with org.mcmodlauncher.shimmy.log4j.Log4JShimProvider;
}