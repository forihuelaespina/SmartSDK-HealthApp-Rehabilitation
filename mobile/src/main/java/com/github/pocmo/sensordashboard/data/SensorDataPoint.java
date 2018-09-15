package com.github.pocmo.sensordashboard.data;

public class SensorDataPoint {
    private String devicename;
    private long timestamp;
    private float[] values;
    private int accuracy;

    public SensorDataPoint(String device, long timestamp, int accuracy, float[] values) {
        this.devicename=device;
        this.timestamp = timestamp;
        this.accuracy = accuracy;
        this.values = values;
    }

    public String getDevicename() {
        return devicename;
    }


    public float[] getValues() {
        return values;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getAccuracy() {
        return accuracy;
    }
}
