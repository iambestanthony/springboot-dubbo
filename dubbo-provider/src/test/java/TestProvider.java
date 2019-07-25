import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JayJ on 2019/7/23.
 **/
public class TestProvider {

        public static void main(String[] args){
            //加载spring配置文件
            ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:springContext.xml");
            try {
                //线程休眠10分钟，保证测试启动后，dubbo服务可使用的时间
                Thread.sleep(10*60*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

}
