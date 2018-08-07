package com.alevel.hometask.oop;

public class ContractStudent extends Student {

    private double pricecontract;

    public ContractStudent(double pricecontract, String name, int age) {
        super(name, age);
        this.pricecontract = pricecontract;
    }

    public double getPricecontract() {
        return pricecontract;
    }

}
