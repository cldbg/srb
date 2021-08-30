package com.cl.srb.core.service.impl;

import com.cl.srb.core.pojo.entity.UserInfo;
import com.cl.srb.core.mapper.UserInfoMapper;
import com.cl.srb.core.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息 服务实现类
 * </p>
 *
 * @author 磊少
 * @since 2021-08-30
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
