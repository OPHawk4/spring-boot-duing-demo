package com.duing.bean;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.io.Serializable;

@TableName("guest")
@Data@AllArgsConstructor@NoArgsConstructor
public class Guest implements Serializable {
    @Value("id")
    private Long id;
    @Value("name")
    private String name;
    @Value("role")
    private String role;
}
