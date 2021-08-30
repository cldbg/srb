package com.cl.srb.core.service.impl;

import com.cl.srb.core.pojo.entity.UserLoginRecord;
import com.cl.srb.core.mapper.UserLoginRecordMapper;
import com.cl.srb.core.service.UserLoginRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户登录记录表 服务实现类
 * </p>
 *
 * @author 磊少
 * @since 2021-08-30
 */
@Service
public class UserLoginRecordServiceImpl extends ServiceImpl<UserLoginRecordMapper, UserLoginRecord> implements UserLoginRecordService {

}
