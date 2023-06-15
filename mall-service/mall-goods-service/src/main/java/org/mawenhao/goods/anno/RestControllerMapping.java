package org.mawenhao.goods.anno;

import cn.hutool.core.annotation.AliasFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

/**
 * TODO
 *
 * @author mawenhao 2023/6/5
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@RestController
@RequestMapping
public @interface RestControllerMapping {
    @AliasFor(annotation = RequestMapping.class)
    String value();
}
