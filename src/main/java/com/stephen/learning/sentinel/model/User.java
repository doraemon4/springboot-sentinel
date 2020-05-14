package com.stephen.learning.sentinel.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author jack
 * @description
 * @date 2020/4/27
 */
@Data
@Builder
public class User {
    private String name;
    private String address;
    private String email;
}
