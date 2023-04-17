package org.mawenhao.goods.service.impl;

import org.mawenhao.goods.entity.Order;
import org.mawenhao.goods.mapper.OrderMapper;
import org.mawenhao.goods.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
