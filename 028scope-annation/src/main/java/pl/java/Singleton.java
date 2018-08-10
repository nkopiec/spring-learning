package pl.java;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class Singleton extends Counter{

}
