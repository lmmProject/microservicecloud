package com.lmm.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: mmli3
 * @Date: Created in 2019/2/15
 * @Description:
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
// 支持链式调用的
@Accessors(chain = true)
public class Dept implements Serializable {

    private static final long serialVersionUID = -8185349997067410298L;
    /* 主键 */
    private Long deptno;
    /* 部门名称 */
    private String dname;
    /* 来自哪个数据库，因为一个服务可以对应一个数据库，同一个信息被存储到不同数据库 */
    private String db_source;

}
