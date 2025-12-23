package com.mrbatista.pousadinha.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.ISpringTemplateEngine;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ITemplateResolver;

import com.mrbatista.pousadinha.controller.HospedeController;

@Configuration
@ComponentScan(basePackageClasses = { HospedeController.class })
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
	private ApplicationContext applicationContext;

//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
    
    public WebConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
    
    @Bean
    public ViewResolver viewResolver() {
    	ThymeleafViewResolver resolver = new ThymeleafViewResolver();
    	resolver.setTemplateEngine(templateEngine());
    	resolver.setCharacterEncoding("UTF-8");
    	return resolver;
    }
    
    @Bean
    public ISpringTemplateEngine templateEngine()
    {
    	SpringTemplateEngine engine = new SpringTemplateEngine();
    	engine.setEnableSpringELCompiler(true);
    	engine.setTemplateResolver(templateResolver());
    	return engine;
    }
    
    private ITemplateResolver templateResolver() {
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setApplicationContext(applicationContext);
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode(TemplateMode.HTML);
        return resolver;
    }

@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
    	registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    	
    }


}