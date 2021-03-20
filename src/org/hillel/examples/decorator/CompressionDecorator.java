package org.hillel.examples.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public String readData() {
        return decompressData(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(compressData(data));
    }

    private String compressData(String data) {
        return data + " with compression";
    }

    private String decompressData(String data) {
        return data;
    }
}
