package com.app.monitor.rest.networking;

import java.util.List;

public class Trace {

    private List<Request> requests;
    private List<Query> queries;

    public List<Request> getRequests() {
        return requests;
    }

    public Trace setRequests(List<Request> requests) {
        this.requests = requests;
        return this;
    }

    public List<Query> getQueries() {
        return queries;
    }

    public Trace setQueries(List<Query> queries) {
        this.queries = queries;
        return this;
    }
}
