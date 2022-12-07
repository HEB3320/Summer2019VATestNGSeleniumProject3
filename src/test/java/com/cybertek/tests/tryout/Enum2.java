package com.cybertek.tests.tryout;

public class Enum2 {


    public enum Company {
        EBAY, PAYPAL, GOOGLE, YAHOO, ATT
    }

    Company cName;

    public Enum2(Company cName) {
        this.cName = cName;
    }

    public void companyDetails() {
        switch (cName) {
            case EBAY:
                System.out.println("EBAY: Biggest Market Place in the World.");
                break;

            case PAYPAL:
                System.out.println("PAYPAL: Simplest way to manage Money.");
                break;

            case GOOGLE:
                System.out.println("GOOGLE: Biggest search engine.");
                break;

            case YAHOO:
                System.out.println("YAHOO: 1st Web 2.0 Company.");
                break;

            default:
                System.out.println("DEFAULT: Google - biggest search giant.. ATT - my carrier provider..");
                break;


        }
    }

    public static void main(String[] args) {
        Enum2 ebay = new Enum2(Company.EBAY);
        ebay.companyDetails();
        Enum2 paypal = new Enum2(Company.PAYPAL);
        paypal.companyDetails();
        Enum2 google = new Enum2(Company.GOOGLE);
        google.companyDetails();
        Enum2 yahoo = new Enum2(Company.YAHOO);
        yahoo.companyDetails();
        Enum2 att = new Enum2(Company.ATT);
        att.companyDetails();
    }
}