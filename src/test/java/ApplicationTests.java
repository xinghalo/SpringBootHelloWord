import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import xingoo.Application;

/**
 * Created by xinghailong on 2017/8/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = Application.class) //指定加载应用启动类
public class ApplicationTests {
    @Test
    public void contextLoads(){

    }
}
