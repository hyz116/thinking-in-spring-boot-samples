package thinking.in.spring.boot.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.io.support.SpringFactoriesLoader;

import java.util.List;

/**
 * {@link SpringFactoriesLoader}
 * 相比于Java原生的{@link java.util.ServiceLoader} SPI机制，Spring 的{@link SpringFactoriesLoader}
 * spring.factories文件要求更加灵活，其是 Properties格式，key不强制要求为严格意义接口的全限定名，可以是注解等。
 * 比如SpringBoot 场景中使用{@link EnableAutoConfiguration}作为key. 这样允许更多的弹性。
 *
 *
 * @author <a href="mailto:hyz992116@gmail.com">hyz</a> <br>
 * @date 2020/11/25 - 13:42
 * @since
 * @see SpringFactoriesLoader
 */
public class SpringFactoriesLoaderDemo {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        List<String> lists = SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.class, classLoader);
        lists.stream().forEach(System.out::println);
    }
}
