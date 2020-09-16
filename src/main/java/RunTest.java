import com.goth.spring.ApplicationContext;
import com.goth.spring.ConfigClass;
import com.goth.spring.ConpomentScan;

/**
 * @Description 启动测试
 * @Author yuan.jianfeng
 * @Date 2020/9/16  11:21 上午
 */
@ConpomentScan("com.goth.bean")//需要被托管bean的路径
public class RunTest {

  ApplicationContext applicationContext =   new ApplicationContext(ConfigClass.class);

}
