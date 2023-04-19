package org.mawenhao.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;
import org.mawenhao.goods.vo.BrandVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
public interface BrandService extends IService<Brand> {
    void add(BrandDto dto);

    void modify(BrandDto dto);

    void delete(Integer id);

    BrandVo get(Integer id);
}
