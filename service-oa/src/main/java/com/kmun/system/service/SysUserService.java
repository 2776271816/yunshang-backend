package com.kmun.system.service;

import com.kmun.model.system.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

public interface SysUserService extends IService<SysUser> {
    void updateStatus(Long id, Integer status);
}