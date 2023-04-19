package org.mawenhao.goods.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.mawenhao.goods.groups.BrandGroup;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * 品牌表相关接口请求入参
 *
 * @author mawenhao 2023/4/19
 */
@Data
@Builder
@ApiModel("品牌表相关接口请求入参")
public class BrandDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    @NotNull(message = "品牌id不能为空", groups = {BrandGroup.Update.class})
    @Null(message = "品牌新增不支持自定义id", groups = {BrandGroup.Add.class})
    private Integer id;

    @ApiModelProperty(value = "品牌名称")
    @NotBlank(message = "品牌名称不能为空", groups = {BrandGroup.Add.class, BrandGroup.Update.class})
    private String name;

    @ApiModelProperty(value = "品牌图片地址")
    private String image;

    @ApiModelProperty(value = "品牌的首字母")
    private String initial;

    @ApiModelProperty(value = "排序")
    private Integer sort;
}
