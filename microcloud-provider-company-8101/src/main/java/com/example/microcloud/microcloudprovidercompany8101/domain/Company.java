package com.example.microcloud.microcloudprovidercompany8101.domain;

import lombok.Data;

import java.io.Serializable;

@SuppressWarnings("serial")
@Data
public class Company implements Serializable {
    private String title;
    private String note;
}