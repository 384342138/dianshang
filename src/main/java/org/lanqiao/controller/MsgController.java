package org.lanqiao.controller;


import org.lanqiao.entity.Shop;
import org.lanqiao.service.ShopServiceInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MsgController {



@Autowired
ShopServiceInfo shopServiceInfo;

@RequestMapping("/seach")
 public List<Shop> getProduct(String produce){
    System.out.println(produce);
    return shopServiceInfo.findProduct(produce);
}
@RequestMapping("/getId")
    public List<Shop> getId(String pname){
    System.out.println(pname);
    return shopServiceInfo.findId(pname);
}
}