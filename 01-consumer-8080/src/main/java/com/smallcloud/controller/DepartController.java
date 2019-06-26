package com.smallcloud.controller;

import com.smallcloud.entity.Depart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/26/026 9:12
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer/depart")
public class DepartController {
    @Autowired
    private RestTemplate restTemplate;

    private static final String SERVICE_PROVIDER ="http://localhost:8081";

    @PostMapping("/save")
    public boolean saveHandle(Depart depart){
        String url = SERVICE_PROVIDER + "/provider/depart/save";
        return restTemplate.postForObject(url,depart,Boolean.class);
    }
    @DeleteMapping("/del/{id}")
    public void removeHandle(@PathVariable("id") int id ){
        String url = SERVICE_PROVIDER+"/provider/depart/del/"+id;
        restTemplate.delete(url);
    }


    @PutMapping("/update")
    public void modifyHandle(Depart depart){
        String url = SERVICE_PROVIDER+"/provider/depart/update/";
        restTemplate.put(url,depart);
    }

    @GetMapping("/get/{id}")
    public Depart getDepartHandle(@PathVariable("id") int id){
        String url = SERVICE_PROVIDER+"/provider/depart/get/"+id;
        return restTemplate.getForObject(url,Depart.class);
    }

    @GetMapping("/list")
    public List<Depart> listAllDepartHandle(){
        String url = SERVICE_PROVIDER+"/provider/depart/list/";
        return restTemplate.getForObject(url,List.class);
    }

}
