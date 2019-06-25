package com.mallCloud.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: YuanGuiyu
 * @Date: 2019/6/25/025 16:48
 * @Version 1.0
 */
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","fieldHandler"})
public class Depart {
    @Id
    /**
     * 主键生成策略:
     *   TABLE：使用一个特定的数据库表格来保存主键。
         SEQUENCE：根据底层数据库的序列来生成主键，条件是数据库支持序列。
         IDENTITY：主键由数据库自动生成（主要是自动增长型）
         AUTO：主键由程序控制。
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
