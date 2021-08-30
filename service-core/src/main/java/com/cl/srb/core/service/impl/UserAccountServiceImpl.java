package com.cl.srb.core.service.impl;

import com.cl.srb.core.pojo.entity.UserAccount;
import com.cl.srb.core.mapper.UserAccountMapper;
import com.cl.srb.core.service.UserAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户账户 服务实现类
 * </p>
 *
 * @author 磊少
 * @since 2021-08-30
 */
@Service
public class UserAccountServiceImpl extends ServiceImpl<UserAccountMapper, UserAccount> implements UserAccountService {

}
