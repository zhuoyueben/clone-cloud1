package com.muggle.poseidon.entity;

import com.muggle.common.user.entity.SystemMenu;
import lombok.Data;

/**
 * @program: poseidon-cloud-user
 * @description:
 * @author: muggle
 * @create: 2020-01-10
 **/
@Data
public class SystemMenuVO extends SystemMenu {
    private static final long serialVersionUID = 6969701887874112395L;

    private Long roleId;
}
