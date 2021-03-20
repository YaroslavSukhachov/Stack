package org.hillel.examples.decorator;

import java.util.Base64;

public class EncryptingDecorator extends DataSourceDecorator {

    public EncryptingDecorator(DataSource wrappee) {
        super(wrappee);
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    private String encode(String data) {
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    private String decode(String data) {
        return new String(Base64.getDecoder().decode(data));
    }
}
