package com.duing.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;
@Entity   /**
 tk.mybatis 包
 @Entity
    证明这是一个实体类
 **/
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    private Long id;
    private String name;
    private String role;
}
