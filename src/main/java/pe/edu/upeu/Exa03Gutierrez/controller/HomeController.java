/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.Exa03Gutierrez.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



/**
 *
 * @author UPEU
 */
@Controller
public class HomeController {

    @RequestMapping(value="/")
    public String listar(){	
            return "index";
    }
	
}

