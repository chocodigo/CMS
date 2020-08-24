package com.cuvic.item;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemController {

    private final ItemService itemService;

    @Autowired
    private ItemController(ItemService itemService) {this.itemService = itemService;}

    @RequestMapping("/item")
    public String item(Model model)throws Exception{
        List<ItemVO> list = itemService.getItemListService();
        model.addAttribute("list",list);
        return "item";
    }
}