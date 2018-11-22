package com.company.lab9.service;

import com.company.lab9.api.Purchaser;
import com.company.lab9.base.Product;

// TODO  implements Purchase
public class OnlineGame implements Purchaser {
    private Product[] products;
    private Long money;



    public static void main(String[] args) {
    OnlineGame game= new OnlineGame(500L);
    Product premium =new Product("Premium account", 100D) ;
    Product weapon=new Product("AK47",2000D);
    Product armor=new Product("Super Armor",30D);

    game.addToBucket(premium,weapon,armor);
    game.buy(premium,weapon,armor);


    }

    public OnlineGame(Long money) {
        this.money = money;
    }

    @Override
    public Product[] addToBucket(Product... product) {
        this.products = product;
        return this.products;
    }

    @Override
    public boolean buy(Product... products) {
        Double sum = 0.0;
        for (Product p : products) {
            sum += p.getPrice();

        }
        System.out.println("total product price is "+sum);
        if (sum <= money) {
            return true;

        }
        System.out.println("Not enough money");
        return false;

    }
}
