package com.mallCloud.provider;

import com.mallCloud.entity.Depart;
import com.mallCloud.respository.DepartRespository;
import com.mallCloud.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/25/025 17:16
 * @Version 1.0
 */
@Service
public class DepartServiceImpl implements DepartService{
    @Autowired
    private DepartRespository departRespository;


    @Override
    public boolean saveDepart(Depart depart) {
        Depart obj = departRespository.save(depart);
        if(obj!=null){
            return true;
        }
        return false;
    }

    @Override
    public boolean removeDepart(int id) {
        if(departRespository.existsById(id)){
            departRespository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        Depart obj = departRespository.save(depart);
        if(obj!=null){
            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(int id) {
        if(departRespository.existsById(id)){
            return departRespository.getOne(id);
        }
        Depart depart = new Depart();
        depart.setName("this is no object!");
        return depart;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return departRespository.findAll();
    }
}
