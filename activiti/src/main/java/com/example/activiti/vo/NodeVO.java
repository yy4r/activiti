package com.example.activiti.vo;

import lombok.Data;

/**
 * @author Jack
 * @date 2021/3/23 10:57 下午
 */
@Data
public class NodeVO {

    private Long id;

    private Long processId;

    //角色 用户
    private String type;

    private String value;

    private String nextId;
}
