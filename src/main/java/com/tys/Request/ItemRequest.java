package com.tys.Request;

import lombok.Data;

@Data
public class ItemRequest {
    private String itemName;
    private String itemType;
    private Double amount;
}
