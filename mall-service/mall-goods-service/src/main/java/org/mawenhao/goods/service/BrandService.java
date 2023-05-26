package org.mawenhao.goods.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;

import java.util.List;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
public interface BrandService extends IService<Brand> {
    Integer add(BrandDto dto);

    void modify(BrandDto dto);

    void delete(Integer id);

    Brand get(Integer id);

    List<Brand> queryList(Brand brand);
}
