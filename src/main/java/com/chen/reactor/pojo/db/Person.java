package com.chen.reactor.pojo.db;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Builder
@Accessors(chain = true)
@Document( collation = "person")
public class Person {

    private String id;

    private String name;

    private Date birthday;

    private String sex;

}
