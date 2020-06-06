package com.study.designmodel.structure.facade;

public class Facade {

    private Bank bank;
    private Taxation taxation;
    private AdminOfIndustry admin;

    public Facade(Bank bank, Taxation taxation, AdminOfIndustry admin) {
        this.bank = bank;
        this.taxation = taxation;
        this.admin = admin;
    }

    public Company openConpany(String name){

        Company c = this.admin.register(name);
        String bankAccount = this.bank.openAccount(c.getId());
        c.setBankAccount(bankAccount);
        String taxCode = this.taxation.applyTaxCode(c.getId());
        c.setTaxCode(taxCode);
        return c;

    }

}
