package org.mawenhao.goods.controller;


import lombok.AllArgsConstructor;
import org.mawenhao.common.Resp;
import org.mawenhao.goods.dto.BrandDto;
import org.mawenhao.goods.entity.Brand;
import org.mawenhao.goods.groups.BrandGroup;
import org.mawenhao.goods.service.BrandService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 品牌表 前端控制器
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@RestController
@RequestMapping("/brand")
@AllArgsConstructor
@Validated
public class BrandController {
    private final BrandService brandService;

    //品牌查询
    @GetMapping("/{id}")
    public Resp<Brand> get(@PathVariable Integer id) {
        return Resp.data(brandService.get(id));
    }

    //品牌新增,分组校验之BrandGroup.Add
    @PostMapping
    public Resp<Integer> add(@Validated(BrandGroup.Add.class) @RequestBody BrandDto dto) {
        return Resp.data(brandService.add(dto));
    }

    //品牌修改,分组校验之BrandGroup.Update
    @PutMapping
    public Resp<String> modify(@Validated(BrandGroup.Update.class) @RequestBody BrandDto dto) {
        brandService.modify(dto);
        return Resp.data("修改成功");
    }

    //品牌删除
    @DeleteMapping("/{id}")
    public Resp<String> delete(@PathVariable Integer id) {
        brandService.delete(id);
        return Resp.data("删除成功");
    }
}

