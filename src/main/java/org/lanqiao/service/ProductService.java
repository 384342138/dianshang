package org.lanqiao.service;

import org.lanqiao.entity.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductService {
     public Product selectByPrimaryKey(Integer proId);
    public List<Product> selectByAll(Integer proId);
}