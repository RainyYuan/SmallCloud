package com.mallCloud.service;

import com.mallCloud.entity.Depart;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/25/025 16:59
 * @Version 1.0
 */

public interface DepartService {
    boolean saveDepart(Depart depart);
    boolean removeDepart(int id );
    boolean modifyDepart(Depart depart);
    Depart getDepartById(int id);
    List<Depart> listAllDeparts();
}
