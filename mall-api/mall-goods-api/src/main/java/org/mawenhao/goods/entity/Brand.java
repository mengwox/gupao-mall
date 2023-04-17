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
 * 品牌表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("brand")
@ApiModel(value = "Brand对象", description = "品牌表")
public class Brand implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "品牌id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "品牌名称")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "品牌图片地址")
    @TableField("image")
    private String image;

    @ApiModelProperty(value = "品牌的首字母")
    @TableField("initial")
    private String initial;

    @ApiModelProperty(value = "排序")
    @TableField("sort")
    private Integer sort;


}
