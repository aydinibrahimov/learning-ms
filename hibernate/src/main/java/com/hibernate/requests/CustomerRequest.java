package com.hibernate.requests;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;


@Getter
public class CustomerRequest {
    public String name;
    public List<ProductRequest> product;

}
