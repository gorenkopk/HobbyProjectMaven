package com.gorenko.pavel;

public class Hobby {
    private byte varByte;
    private short varShort;
    private char varChar;
    private int varInt;
    private long varLong;
    private float varFloat;
    private double varDouble;
    private boolean varBoolean;

    public Hobby() {

    }

    public Hobby(byte b, short s, char c, int i, long l, float f, double d, boolean bool) {
        this.setVarByte(b);
        this.setVarShort(s);
        this.setVarChar(c);
        this.setVarInt(i);
        this.setVarLong(l);
        this.setVarFloat(f);
        this.setVarDouble(d);
        this.setVarBoolean(bool);
    }

    public Hobby(int i, float f){
        this.setVarInt(i);
        this.setVarFloat(f);
    }

    public Hobby(float f, double d) {
        this.varFloat = f;
        this.varDouble = d;
    }

    public byte getVarByte() {
        return varByte;
    }

    public short getVarShort() {
        return varShort;
    }

    public char getVarChar() {
        return varChar;
    }

    public int getVarInt() {
        return varInt;
    }

    public long getVarLong() {
        return varLong;
    }

    public float getVarFloat() {
        return varFloat;
    }

    public double getVarDouble() {
        return varDouble;
    }

    public boolean isVarBoolean() {
        return varBoolean;
    }

    public void setVarByte(byte varByte) {
        this.varByte = varByte;
    }

    public void setVarShort(short varShort) {
        this.varShort = varShort;
    }

    public void setVarChar(char varChar) {
        this.varChar = varChar;
    }

    public void setVarInt(int varInt) {
        this.varInt = varInt;
    }

    public void setVarLong(long varLong) {
        this.varLong = varLong;
    }

    public void setVarFloat(float varFloat) {
        this.varFloat = varFloat;
    }

    public void setVarDouble(double varDouble) {
        this.varDouble = varDouble;
    }

    public void setVarBoolean(boolean varBoolean) {
        this.varBoolean = varBoolean;
    }

    @Override
    public String toString() {
        return "Hobby(" +
                "varByte = " + varByte +
                ", varShort = " + varShort +
                ", varChar = " + varChar +
                ", varInt = " + varInt +
                ", varLong = " + varLong +
                ", varFloat = " + varFloat +
                ", varDouble = " + varDouble +
                ", varBoolean = " + varBoolean +
                ')';
    }
}
