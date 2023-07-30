package com.example.controller.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ExProductVO {
    private String productName;
    private Long productPrice;
    private Long productStock;
    private String productBrand;
}
