package org.hillel.examples.decorator;

public interface DataSource {
    String readData();
    void writeData(String data);
}
