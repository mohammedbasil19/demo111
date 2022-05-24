package com.revature.project1.controller;

import com.revature.project1.dao.ItemDAO;
import com.revature.project1.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item") //localhost:8085/item
public class ItemController {

    @Autowired
    ItemDAO itemDAO;

    @Autowired
    Item item;

    @GetMapping()
    public List<Item> getItem(@RequestBody Item item) {
//        itemDAO.findAll();
        return itemDAO.findAll();
    }

    @PostMapping
    public boolean addItem(@RequestBody Item item) {
        itemDAO.save(item);
        return true;
    }

    @GetMapping("{itemId}")
    public Item getItem(@PathVariable("itemId") Integer itemId) {

        return itemDAO.getById(itemId);
    }

    @DeleteMapping
    public String deleteItem(@PathVariable("pItemId") int itemId) {
        itemDAO.deleteById(itemId);
        return "item deleted successfully";
    }

    @PutMapping
    public String updateItem(@RequestBody Item item) {
        itemDAO.save(item);
        return "item saved successfully";
    }
}
