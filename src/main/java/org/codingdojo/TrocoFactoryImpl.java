package org.codingdojo;

public class TrocoFactoryImpl implements TrocoFactory {
    public Troco newInstance() {
        return new TrocoImpl();
    }
}