package com.cz.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

@Data
@Alias("user")
@AllArgsConstructor
@NoArgsConstructor
//实体类
public class User {
    private int id;

    private String name;


    private String password;


}
