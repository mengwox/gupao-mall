package org.mawenhao.goods.service.impl;

import org.mawenhao.goods.entity.Category;
import org.mawenhao.goods.mapper.CategoryMapper;
import org.mawenhao.goods.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目 服务实现类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
