package Nothing.DemoSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{	
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
    	Dev obj = (Dev) context.getBean(Dev.class );
    //	System.out.println(obj.getAge());
    	obj.build();
    }
}
