package com.rohman.design.pattern.facade;

public class Akun {
    private int no;
    private long balance;

    public Akun(int no, long balance) {
        this.no = no;
        this.balance = balance;
    }

    public int getNo() {
        return no;
    }

    public long getBalance() {
        return balance;
    }
}
