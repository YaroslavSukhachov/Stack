package org.hillel.examples.decorator;

public class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }
}
