package unicobib.dependencyinjection.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import unicobib.dependencyinjection.didemo.controller.ConstructorInjectedController;
import unicobib.dependencyinjection.didemo.controller.HelloWorldController;
import unicobib.dependencyinjection.didemo.controller.PropertyInjectedController;
import unicobib.dependencyinjection.didemo.controller.SetterInjectedController;
import unicobib.dependencyinjection.didemo.examplebeans.FakeDataSource;
import unicobib.dependencyinjection.didemo.examplebeans.FakeJmsBroker;

@SpringBootApplication
@ComponentScan(basePackages = {"unicobib.service","unicobib.dependencyinjection"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        HelloWorldController ctrl = (HelloWorldController)ctx.getBean("helloWorldController");

//        System.out.println("#####################################");
//        System.out.println(ctrl.hello());
//
//        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//
//        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
//
//        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource)ctx.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUserName());
        System.out.println(fakeDataSource.getPassWord());

        System.out.println("-----------------------------------------------");
        FakeJmsBroker fakeJmsBroker = (FakeJmsBroker)ctx.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUsername());
        System.out.println(fakeJmsBroker.getPassword());
    }

}
