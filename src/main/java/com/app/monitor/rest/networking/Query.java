package com.app.monitor.rest.networking;

public class Query {

    private String id;
    private String command;

    public String getId() {
        return id;
    }

    public Query setId(String id) {
        this.id = id;
        return this;
    }

    public String getCommand() {
        return command;
    }

    public Query setCommand(String command) {
        this.command = command;
        return this;
    }
}
