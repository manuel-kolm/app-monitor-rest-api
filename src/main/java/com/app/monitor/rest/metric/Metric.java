package com.app.monitor.rest.metric;

import java.util.ArrayList;
import java.util.List;

public class Metric {

    private String processId;
    private List<MetricData> data;

    public String getProcessId() {
        return processId;
    }

    public Metric setProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    public List<MetricData> getData() {
        if (data == null) {
            data = new ArrayList<>();
        }
        return data;
    }

    public Metric setData(List<MetricData> data) {
        this.data = data;
        return this;
    }
}
