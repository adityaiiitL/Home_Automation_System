package com.group2.AllDevices;

public interface Connection {
    void connectToCentralNode();
    // connect to the main device -->
    // how to connect will be company and device dependent how they will implement this

    void endConnection();
}
