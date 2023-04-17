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
@TableName("category_attr")
@ApiModel(value = "CategoryAttr对象", description = "")
public class CategoryAttr implements Serializable {


    private static final long serialVersionUID = 1L;

    @TableId("category_id")
    private Integer categoryId;

    @ApiModelProperty(value = "属性分类表")
    @TableField("attr_id")
    private Integer attrId;


}
