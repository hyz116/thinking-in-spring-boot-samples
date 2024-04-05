package thinking.in.spring.boot.serviceloader;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * {@link java.util.ServiceLoader} Demo
 * 使用场景：logback-classic jar <p></p>
 * <a href="https://docs.oracle.com/javase/tutorial/ext/basics/spi.html">Java SPI</a>
 *
 * 缺点：
 * 类{@link ServiceLoader} 无法被扩展，不能修改其行为。可以使用自定义类加载器来加载指定的类。同时无法动态
 * 反应 service provider的变化，比如新增等。
 *
 * @author <a href="mailto:hyz992116@gmail.com">hyz</a> <br>
 * @date 2020/11/25 - 14:01
 * @since
 */
public class ServiceLoaderDemo {
    public static void main(String[] args) {
        ServiceLoader<DemoService> services = ServiceLoader.load(DemoService.class);
        Iterator<DemoService> iterator = services.iterator();
        while (iterator.hasNext()) {
            iterator.next().sayHello("hello world");
        }
    }
}
