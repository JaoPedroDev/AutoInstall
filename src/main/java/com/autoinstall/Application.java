package com.autoinstall;

public class Application {
    private String name;
    private String installerPath;
    private String command;

    public Application(String name, String installerPath, String command) {
        this.name = name;
        this.installerPath = installerPath;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public String getInstallerPath() {
        return installerPath;
    }

    public String getCommand() {
        return command;
    }
}
