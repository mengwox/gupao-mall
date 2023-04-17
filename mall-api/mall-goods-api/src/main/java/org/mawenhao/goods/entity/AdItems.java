package org.mawenhao.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@TableName("ad_items")
@ApiModel(value = "AdItems对象", description = "")
public class AdItems implements Serializable {


    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @ApiModelProperty(value = "分类，1首页推广,2列表页推广")
    @TableField("type")
    private Integer type;

    @ApiModelProperty(value = "展示的产品")
    @TableField("sku_id")
    private String skuId;

    @ApiModelProperty(value = "排序")
    @TableField("sort")
    private Integer sort;


}
