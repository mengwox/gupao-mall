package org.mawenhao.goods.service.impl;

import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.val;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;
import org.mawenhao.goods.mapper.BrandMapper;
import org.mawenhao.goods.service.BrandService;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

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

    @Override
    public Integer add(BrandDto dto) {
        Brand addEntity = Brand.builder().build();
        DTO_2_ENTITY.copy(dto, addEntity, null);
        Assert.isTrue(save(addEntity), "新增失败");
        return addEntity.getId();
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
    public Brand get(Integer id) {
        return getById(id);
    }

    @Override
    public List<Brand> queryList(Brand brand) {
        val wrapper = new LambdaQueryChainWrapper<>(baseMapper);
        return wrapper
                .eq(brand.getId() != null, Brand::getId, brand.getId())
                .eq(StrUtil.isNotBlank(brand.getName()), Brand::getName, brand.getName())
                .eq(StrUtil.isNotBlank(brand.getInitial()), Brand::getInitial, brand.getInitial())
                .eq(StrUtil.isNotBlank(brand.getImage()), Brand::getImage, brand.getImage())
                .eq(brand.getSort() != null, Brand::getSort, brand.getSort())
                .list();
    }
}
