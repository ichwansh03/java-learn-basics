package org.example.basic.enums;

public enum State {
    JABAR("Jawa Barat"),
    JATENG("Jawa Tengah"),
    JATIM("Jawa Timur");

    private final String name;

    State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
