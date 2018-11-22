package com.company.lab9.store;

import com.company.lab9.base.AbstractStore;
import com.company.lab9.base.Product;

public class FairSeller extends AbstractStore {

    public FairSeller(String storeName, Product[] products) {
        super(storeName, products);
    }

    @Override
    protected void registerNewProduct(Product newProduct) {

    }
}
