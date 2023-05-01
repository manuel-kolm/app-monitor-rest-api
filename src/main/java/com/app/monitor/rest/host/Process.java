package com.app.monitor.rest.host;

import com.app.monitor.rest.system.OperatingSystem;

import java.time.ZonedDateTime;

public class Process {

    private String id;
    private ZonedDateTime created;
    private String name;
    private int availableProcessors;
    private OperatingSystem operatingSystem;
    private int exitCode;

    public String getId() {
        return id;
    }

    public Process setId(String id) {
        this.id = id;
        return this;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public Process setCreated(ZonedDateTime created) {
        this.created = created;
        return this;
    }

    public String getName() {
        return name;
    }

    public Process setName(String name) {
        this.name = name;
        return this;
    }

    public int getAvailableProcessors() {
        return availableProcessors;
    }

    public Process setAvailableProcessors(int availableProcessors) {
        this.availableProcessors = availableProcessors;
        return this;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Process setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    public int getExitCode() {
        return exitCode;
    }

    public Process setExitCode(int exitCode) {
        this.exitCode = exitCode;
        return this;
    }
}
