package io.github.guisso.jakartaee8.myhellojsf;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * A simple CDI managed bean.
 * 
 * @author Luis Guisso <luis.guisso at ifnmg.edu.br>
 */
@Named
@RequestScoped
public class Hello
        implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
