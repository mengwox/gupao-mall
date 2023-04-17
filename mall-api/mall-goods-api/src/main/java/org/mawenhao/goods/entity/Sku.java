package org.mawenhao.goods.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 商品表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sku")
@ApiModel(value = "Sku对象", description = "商品表")
public class Sku implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "商品id")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "SKU名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "价格（分）")
    @TableField("price")
    private Integer price;

    @ApiModelProperty(value = "库存数量")
    @TableField("num")
    private Integer num;

    @ApiModelProperty(value = "商品图片")
    @TableField("image")
    private String image;

    @ApiModelProperty(value = "商品图片列表")
    @TableField("images")
    private String images;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "SPUID")
    @TableField("spu_id")
    private String spuId;

    @ApiModelProperty(value = "类目ID")
    @TableField("category_id")
    private Integer categoryId;

    @ApiModelProperty(value = "类目名称")
    @TableField("category_name")
    private String categoryName;

    @ApiModelProperty(value = "品牌id")
    @TableField("brand_id")
    private Integer brandId;

    @ApiModelProperty(value = "品牌名称")
    @TableField("brand_name")
    private String brandName;

    @ApiModelProperty(value = "规格")
    @TableField("sku_attribute")
    private String skuAttribute;

    @ApiModelProperty(value = "商品状态 1-正常，2-下架，3-删除")
    @TableField("status")
    private Integer status;


}
