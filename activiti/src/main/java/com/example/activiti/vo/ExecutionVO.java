package com.example.activiti.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author Jack
 * @date 2021/3/23 11:24 下午
 */
@Data
public class ExecutionVO {

    private Long id;

    private Long processId;

    private LocalDateTime beginTime;

    private LocalDateTime endTime;
}
