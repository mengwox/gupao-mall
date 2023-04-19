package org.mawenhao.goods.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;
import org.mawenhao.goods.mapper.BrandMapper;
import org.mawenhao.goods.service.BrandService;
import org.mawenhao.goods.vo.BrandVo;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {
    /**
     * bean copy, dto to entity
     */
    private static final BeanCopier DTO_2_ENTITY = BeanCopier.create(BrandDto.class, Brand.class, false);
    /**
     * bean copy, entity to vo
     */
    private static final BeanCopier ENTITY_2_VO = BeanCopier.create(Brand.class, BrandVo.class, false);

    @Override
    public void add(BrandDto dto) {
        Brand addEntity = Brand.builder().build();
        DTO_2_ENTITY.copy(dto, addEntity, null);
        Assert.isTrue(save(addEntity), "新增失败");
    }

    @Override
    public void modify(BrandDto dto) {
        Brand updateEntity = Brand.builder().build();
        DTO_2_ENTITY.copy(dto, updateEntity, null);
        Assert.isTrue(updateById(updateEntity), "更新失败");
    }

    @Override
    public void delete(Integer id) {
        Assert.isTrue(baseMapper.deleteById(id) == 1, "删除失败");
    }

    @Override
    public BrandVo get(Integer id) {
        Brand brand = getById(id);
        if (brand == null) {
            return null;
        }
        BrandVo result = new BrandVo();
        ENTITY_2_VO.copy(brand, result, null);
        return result;
    }
}
