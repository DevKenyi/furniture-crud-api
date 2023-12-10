package com.kenyi.furniture.collection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Controller;

@Data
@Builder
@Document(collection = "furniture")
@NoArgsConstructor
@AllArgsConstructor
public class Furniture {
    @Id
    private Long id;
    private FurnitureType furnitureType;
    private String brand;
    private String material;
    private Integer quantity;
    private Double price;
    private Double total;

    public Double getTotal() {

        return total = getPrice()*getQuantity();
    }


}
