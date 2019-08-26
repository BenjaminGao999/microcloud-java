package com.example.microcloud.microcloudapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private String loc;

}
