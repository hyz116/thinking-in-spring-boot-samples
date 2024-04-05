package thinking.in.spring.boot.serviceloader;

/**
 * @author <a href="mailto:hyz992116@gmail.com">hyz</a> <br>
 * @date 2020/11/25 - 13:59
 * @since
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public void sayHello(String str) {
        System.out.println(str);
    }
}
