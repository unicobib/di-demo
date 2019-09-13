package unicobib.dependencyinjection.didemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import unicobib.dependencyinjection.didemo.examplebeans.FakeDataSource;
import unicobib.dependencyinjection.didemo.examplebeans.FakeJmsBroker;

@Configuration
//@PropertySource({"classpath:datasource.properties" , "classpath:jmsbroker.properties"})
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jmsbroker.properties")
//})
public class PropertyConfig {
    @Value("${unicobib.username}")
    String user;
    @Value("${unicobib.password}")
    String password;
    @Value("${unicobib.dburl}")
    String url;
    @Value("${unicobib.jms.username}")
    String username;
    @Value("${unicobib.jms.password}")
    String jmsPassword;
    @Value("${unicobib.jms.url}")
    String jmsUrl;


//    @Autowired
//    Environment env;
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(user);
        fakeDataSource.setPassWord(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUsername(username);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setPassword(jmsUrl);

        return fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
