package it.academy.shopping.controllers;


import it.academy.shopping.entity.ShoppingItem;
import it.academy.shopping.repository.ShoppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ShoppingListController {
    @Autowired
    private ShoppingRepository repository;

    @GetMapping
    public String indexPage(Model model){
        model.addAttribute("items",repository.findAll());
        model.addAttribute("item",new ShoppingItem());
        return "index";
    }
    @PostMapping
    public String newShoppingItem(ShoppingItem shoppingItem){
        repository.save(shoppingItem);
        return "redirect:/";
    }
    @DeleteMapping("/{id}")
    public String deleteShoppingItem(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/";
    }
}
