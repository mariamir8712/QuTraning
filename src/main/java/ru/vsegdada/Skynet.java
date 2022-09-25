package ru.vsegdada;

import java.sql.SQLOutput;

public class Skynet {
    private final boolean riseRevolution;
    private int terminatorsCount;

    public Skynet() {
        this(1);

    }

    public Skynet(int terminatorsCount) {
        this.terminatorsCount = terminatorsCount;
        this.riseRevolution = true;
    }

    public void startRevolution() {
        System.out.println("Revolution is started!");
    }

    public boolean isRiseRevolution() {
        return riseRevolution;
    }

    public int getTerminatorsCount() {
        return terminatorsCount;
    }

    public void setTerminatorsCount(int terminatorsCount) {
        this.terminatorsCount = terminatorsCount;
    }
}
