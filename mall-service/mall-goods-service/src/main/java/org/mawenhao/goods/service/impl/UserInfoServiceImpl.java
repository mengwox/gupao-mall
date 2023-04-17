package org.mawenhao.goods.service.impl;

import org.mawenhao.goods.entity.UserInfo;
import org.mawenhao.goods.mapper.UserInfoMapper;
import org.mawenhao.goods.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
