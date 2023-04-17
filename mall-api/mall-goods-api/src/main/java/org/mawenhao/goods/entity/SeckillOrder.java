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
@TableName("seckill_order")
@ApiModel(value = "SeckillOrder对象", description = "")
public class SeckillOrder implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "秒杀商品ID")
    @TableField("seckill_goods_id")
    private String seckillGoodsId;

    @ApiModelProperty(value = "支付金额")
    @TableField("money")
    private Integer money;

    @ApiModelProperty(value = "用户")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "支付时间")
    @TableField("pay_time")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "状态，0未支付，1已支付")
    @TableField("status")
    private Integer status;

    @ApiModelProperty(value = "交易流水")
    @TableField("weixin_transaction_id")
    private String weixinTransactionId;


}
