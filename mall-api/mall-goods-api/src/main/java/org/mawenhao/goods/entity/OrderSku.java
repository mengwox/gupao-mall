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

/**
 * <p>
 *
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_sku")
@ApiModel(value = "OrderSku对象", description = "")
public class OrderSku implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "ID")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "1级分类")
    @TableField("category_one_id")
    private Integer categoryOneId;

    @ApiModelProperty(value = "2级分类")
    @TableField("category_two_id")
    private Integer categoryTwoId;

    @ApiModelProperty(value = "3级分类")
    @TableField("category_three_id")
    private Integer categoryThreeId;

    @ApiModelProperty(value = "SPU_ID")
    @TableField("spu_id")
    private String spuId;

    @ApiModelProperty(value = "SKU_ID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty(value = "订单ID")
    @TableField("order_id")
    private String orderId;

    @ApiModelProperty(value = "商品名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "单价")
    @TableField("price")
    private Integer price;

    @ApiModelProperty(value = "数量")
    @TableField("num")
    private Integer num;

    @ApiModelProperty(value = "总金额")
    @TableField("money")
    private Integer money;

    @ApiModelProperty(value = "图片地址")
    @TableField("image")
    private String image;


}
