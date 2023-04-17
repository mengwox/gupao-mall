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
 *
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("seckill_goods")
@ApiModel(value = "SeckillGoods对象", description = "")
public class SeckillGoods implements Serializable {


    private static final long serialVersionUID = 1L;

    @TableId("id")
    private String id;

    @ApiModelProperty(value = "spu ID")
    @TableField("sup_id")
    private String supId;

    @ApiModelProperty(value = "sku ID")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty(value = "标题")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "商品图片")
    @TableField("images")
    private String images;

    @ApiModelProperty(value = "原价格")
    @TableField("price")
    private Integer price;

    @ApiModelProperty(value = "秒杀价格")
    @TableField("seckill_price")
    private Double seckillPrice;

    @ApiModelProperty(value = "添加日期")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "开始时间")
    @TableField("start_time")
    private LocalDateTime startTime;

    @ApiModelProperty(value = "结束时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "秒杀商品数")
    @TableField("num")
    private Integer num;

    @ApiModelProperty(value = "剩余库存数")
    @TableField("store_count")
    private Integer storeCount;

    @ApiModelProperty(value = "描述")
    @TableField("content")
    private String content;


}
