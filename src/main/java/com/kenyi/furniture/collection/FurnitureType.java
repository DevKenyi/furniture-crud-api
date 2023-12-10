package com.kenyi.furniture.collection;

public enum FurnitureType {
    Sofas ("Sofas"),
    DinningTable("Dinning Table"),
    Bed("Bed"),
    OfficeChairs("Office chairs");

    private String furniture;

    FurnitureType(String furniture) {
        this.furniture = furniture;
    }

    public String getFurniture() {
        return furniture;
    }
}
