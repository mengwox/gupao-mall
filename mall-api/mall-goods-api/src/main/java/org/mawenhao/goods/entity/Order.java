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
@TableName("order")
@ApiModel(value = "Order对象", description = "")
public class Order implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "数量合计")
    @TableField("total_num")
    private Integer totalNum;

    @ApiModelProperty(value = "金额合计")
    @TableField("moneys")
    private Integer moneys;

    @ApiModelProperty(value = "支付类型，1、在线支付、0 货到付款")
    @TableField("pay_type")
    private String payType;

    @ApiModelProperty(value = "订单创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "订单更新时间")
    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "付款时间")
    @TableField("pay_time")
    private LocalDateTime payTime;

    @ApiModelProperty(value = "发货时间")
    @TableField("consign_time")
    private LocalDateTime consignTime;

    @ApiModelProperty(value = "交易完成时间")
    @TableField("end_time")
    private LocalDateTime endTime;

    @ApiModelProperty(value = "用户名称")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "收货人")
    @TableField("recipients")
    private String recipients;

    @ApiModelProperty(value = "收货人手机")
    @TableField("recipients_mobile")
    private String recipientsMobile;

    @ApiModelProperty(value = "收货人地址")
    @TableField("recipients_address")
    private String recipientsAddress;

    @ApiModelProperty(value = "交易流水号")
    @TableField("weixin_transaction_id")
    private String weixinTransactionId;

    @ApiModelProperty(value = "订单状态,0:未完成,1:已完成，2：已退货")
    @TableField("order_status")
    private Integer orderStatus;

    @ApiModelProperty(value = "支付状态,0:未支付，1：已支付，2：支付失败")
    @TableField("pay_status")
    private Integer payStatus;

    @ApiModelProperty(value = "是否删除")
    @TableField("is_delete")
    private Integer isDelete;


}
