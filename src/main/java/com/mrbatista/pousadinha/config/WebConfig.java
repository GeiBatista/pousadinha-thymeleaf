package com.mrbatista.pousadinha.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.mrbatista.pousadinha.controller.HospedeController;

@Configuration
@ComponentScan(basePackageClasses = { HospedeController.class })
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

}