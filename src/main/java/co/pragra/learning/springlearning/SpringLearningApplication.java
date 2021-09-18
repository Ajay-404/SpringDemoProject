package co.pragra.learning.springlearning;

import co.pragra.learning.springlearning.business.QuoteGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.nio.file.Path;
import java.nio.file.Paths;

//@SpringBootApplication
public class SpringLearningApplication {

    public static void main(String[] args)
    {
        //SpringApplication.run(SpringLearningApplication.class, args);
        Path path = Paths.get("src/main/resources/beans.xml");
        ApplicationContext context =  new FileSystemXmlApplicationContext(path.toString());

        QuoteGenerator generator = context.getBean("quoteGenerator", QuoteGenerator.class);
        System.out.println(generator.getQuote());
    }

}
