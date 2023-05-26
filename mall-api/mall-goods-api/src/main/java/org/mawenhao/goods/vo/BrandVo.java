package org.mawenhao.goods.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * 查询品牌-响应vo
 *
 * @author mawenhao 2023/4/19
 */
public class BrandVo implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    private Integer id;

    @ApiModelProperty(value = "品牌名称")
    private String name;

    @ApiModelProperty(value = "品牌图片地址")
    private String image;

    @ApiModelProperty(value = "品牌的首字母")
    private String initial;

    @ApiModelProperty(value = "排序")
    private Integer sort;
}
