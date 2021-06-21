package it.academy.shopping.controllers;


import it.academy.shopping.entity.ShoppingItem;
import it.academy.shopping.entity.User;
import it.academy.shopping.repository.ShoppingRepository;
import it.academy.shopping.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;


@Controller
public class ShoppingListController {

    private static final Logger logger = LoggerFactory.getLogger(ShoppingListController.class);
    @Autowired
    private ShoppingRepository repository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String indexPage(Model model, Principal principal){
        logger.info("User name {}",principal.getName());

        model.addAttribute("items",repository.findByUserUsername(principal.getName()));
        model.addAttribute("item",new ShoppingItem());
        return "index";
    }
    @PostMapping
    public String newShoppingItem(ShoppingItem shoppingItem,Principal principal){
        logger.info("User name {}",principal.getName());

        User user =userRepository.findByUsername(principal.getName()).get();
        shoppingItem.setUser(user);
        repository.save(shoppingItem);
        return "redirect:/";
    }
    @DeleteMapping("/{id}")
    public String deleteShoppingItem(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/";
    }
}
