/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.labti.springHibernate1;

import com.labti.springHibernate.service.MahasiswaService;
import com.labti.springHibernate.view.MahasiswaView;
import org.springframework.context.ApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = newClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new MahasiswaView().setVisible(true);
    }
    
    public static MahasiswaService getMahasiswaService(){
        return(MahasiswaService)applicationContext.getBean("MahasiswaService");
    }

    private static ApplicationContext newClassPathXmlApplicationContext(String classpathspringconfigurationxml) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

    
}
