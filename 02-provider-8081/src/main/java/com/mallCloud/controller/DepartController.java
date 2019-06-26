package com.mallCloud.controller;

import com.mallCloud.entity.Depart;
import com.mallCloud.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/25/025 17:26
 * @Version 1.0
 */
@RestController
@RequestMapping("/provider/depart")
public class DepartController {

    @Autowired
    private DepartService departService;


    /**
     * "/save"不是必须的，可以根据请求的类型post/get/...来区分
     * @return
     */
    @PostMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart){
        return departService.saveDepart(depart);
    }


    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id") int id){
        return departService.removeDepart(id);
    }

    @PutMapping("/update")
    public boolean updateHandle(@RequestBody Depart depart){
        return departService.modifyDepart(depart);
    }


    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id") int id){
        return departService.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandle(){
        return departService.listAllDeparts();
    }
}
