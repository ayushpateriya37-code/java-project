public class CCRMApplication {
    public static void main(String[] args) {
        // Support a non-interactive smoke-test mode to verify classes load correctly:
        // java -cp java CCRMApplication --smoke
        if (args != null && args.length > 0 && "--smoke".equals(args[0])) {
            System.out.println("Running smoke-test: initializing AppConfig only...");
            AppConfig cfg = AppConfig.getInstance();
            cfg.displayPlatformInfo();
            System.out.println("Smoke-test completed. AppConfig startup time: " + cfg.getStartupTime());
            return;
        }

        // Default behaviour: launch the interactive CLI
        CCRMCommandLine cli = new CCRMCommandLine();
        cli.run();
    }
}
