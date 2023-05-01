package com.app.monitor.rest.system;

public class OperatingSystem {

    private String name;
    private String arch;
    private String version;

    public String getName() {
        return name;
    }

    public OperatingSystem setName(String name) {
        this.name = name;
        return this;
    }

    public String getArch() {
        return arch;
    }

    public OperatingSystem setArch(String arch) {
        this.arch = arch;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public OperatingSystem setVersion(String version) {
        this.version = version;
        return this;
    }
}
