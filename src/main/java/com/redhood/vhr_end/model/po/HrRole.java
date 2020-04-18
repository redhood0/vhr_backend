package com.redhood.vhr_end.model.po;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author redhood
 * @since 2020-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="HrRole对象", description="")
public class HrRole implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer hrid;

    private Integer rid;


}
