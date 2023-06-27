package org.mawenhao.goods.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.handler.TableNameHandler;
import com.baomidou.mybatisplus.extension.plugins.inner.DynamicTableNameInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.mawenhao.goods.CityCodeHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author mawenhao
 * @since 2023/6/27
 */
@Component
public class DynamicTableNameBeanPostProcessor implements BeanPostProcessor {

  @Override
  public Object postProcessAfterInitialization(@NotNull Object bean, @NotNull String beanName) throws BeansException {
    if (bean instanceof MybatisPlusInterceptor) {
      MybatisPlusInterceptor interceptor = (MybatisPlusInterceptor) bean;
      interceptor.addInnerInterceptor(dynamicTableNameInterceptor());
      return interceptor;
    }
    return bean;
  }

  private InnerInterceptor dynamicTableNameInterceptor() {
    DynamicTableNameInnerInterceptor interceptor = new DynamicTableNameInnerInterceptor();
    CityCodeHandler handler = new CityCodeHandler();
    Set<String> dynamicTables = handler.dynamicTables();

    Map<String, TableNameHandler> map = new HashMap<>(dynamicTables.size());
    for (String table : dynamicTables) {
      map.put(table, handler);
    }
    interceptor.setTableNameHandlerMap(map);

    return interceptor;
  }
}
