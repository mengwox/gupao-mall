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
@TableName("spu")
@ApiModel(value = "Spu对象", description = "")
public class Spu implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId("id")
    private String id;

    @ApiModelProperty(value = "SPU名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "简介")
    @TableField("intro")
    private String intro;

    @ApiModelProperty(value = "品牌ID")
    @TableField("brand_id")
    private Integer brandId;

    @ApiModelProperty(value = "一级分类")
    @TableField("category_one_id")
    private Integer categoryOneId;

    @ApiModelProperty(value = "二级分类")
    @TableField("category_two_id")
    private Integer categoryTwoId;

    @ApiModelProperty(value = "三级分类")
    @TableField("category_three_id")
    private Integer categoryThreeId;

    @ApiModelProperty(value = "图片列表")
    @TableField("images")
    private String images;

    @ApiModelProperty(value = "售后服务")
    @TableField("after_sales_service")
    private String afterSalesService;

    @ApiModelProperty(value = "介绍")
    @TableField("content")
    private String content;

    @ApiModelProperty(value = "规格列表")
    @TableField("attribute_list")
    private String attributeList;

    @ApiModelProperty(value = "是否上架,0已下架，1已上架")
    @TableField("is_marketable")
    private Integer isMarketable;

    @ApiModelProperty(value = "是否删除,0:未删除，1：已删除")
    @TableField("is_delete")
    private Integer isDelete;

    @ApiModelProperty(value = "审核状态，0：未审核，1：已审核，2：审核不通过")
    @TableField("status")
    private Integer status;


}
