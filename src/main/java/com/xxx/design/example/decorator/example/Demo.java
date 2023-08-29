package com.xxx.design.example.decorator.example;

public class Demo {

    public static void main(String[] args) {
        Person xc = new Person("小菜");

        System.out.println("第一种打扮");

        Sneakers pqx = new Sneakers();
        BigTrouser kk = new BigTrouser();
        TShirts dtx = new TShirts();

        pqx.Decorate(xc);
        kk.Decorate(pqx);
        dtx.Decorate(kk);

        dtx.show();

        System.out.println("第二种打扮");


        LeatherShoes px = new LeatherShoes();
        Tie ld = new Tie();
        Suit xz = new Suit();

        px.Decorate(xc);
        ld.Decorate(px);
        xz.Decorate(ld);

        xz.show();
    }
}
