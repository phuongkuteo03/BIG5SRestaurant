package com.store.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.store.dao.BanDAO;
import com.store.entity.Ban;
import com.store.entity.MenuMonAn;
import com.store.entity.TaiKhoan;
import com.store.service.BanService;
import com.store.service.MenuMonAnService;
import com.store.service.TaiKhoanService;

@Controller
public class MenuController {
    @Autowired
    TaiKhoanService taiKhoanService;
    @Autowired
    MenuMonAnService menuMonAnService;
    @Autowired
    BanService banService;
    @Autowired
    BanDAO banDAO;

    @RequestMapping("/menu")
    public String menu(HttpServletRequest request, Model model) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        return "menu/view";
    }

    @GetMapping("/menu")
    public String viewProductByCategory(HttpServletRequest request, Model model,
            @RequestParam("p") Optional<Integer> p) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        List<MenuMonAn> items_thitbo = menuMonAnService.findByCategory("thitbo");
        model.addAttribute("items_thitbo", items_thitbo);
        List<MenuMonAn> items_thitheo = menuMonAnService.findByCategory("thitheo");
        model.addAttribute("items_thitheo", items_thitheo);
        List<MenuMonAn> items_thitga = menuMonAnService.findByCategory("thitga");
        model.addAttribute("items_thitga", items_thitga);
        List<MenuMonAn> items_salad = menuMonAnService.findByCategory("salad");
        model.addAttribute("items_salad", items_salad);
        List<MenuMonAn> items_my = menuMonAnService.findByCategory("my");
        model.addAttribute("items_my", items_my);
        List<MenuMonAn> items_com = menuMonAnService.findByCategory("com");
        model.addAttribute("items_com", items_com);
        List<MenuMonAn> items_haisan = menuMonAnService.findByCategory("haisan");
        model.addAttribute("items_haisan", items_haisan);
        List<MenuMonAn> items_raucu = menuMonAnService.findByCategory("raucu");
        model.addAttribute("items_raucu", items_raucu);
        List<MenuMonAn> items_douong = menuMonAnService.findByCategory("douong");
        model.addAttribute("items_douong", items_douong);
        return "menu/view";
    }
    @GetMapping("/order/menu")
    public String addMenuToOrder(HttpServletRequest request, Model model,
            @RequestParam("p") Optional<Integer> p) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        List<MenuMonAn> items_thitbo = menuMonAnService.findByCategory("thitbo");
        model.addAttribute("items_thitbo", items_thitbo);
        List<MenuMonAn> items_thitheo = menuMonAnService.findByCategory("thitheo");
        model.addAttribute("items_thitheo", items_thitheo);
        List<MenuMonAn> items_thitga = menuMonAnService.findByCategory("thitga");
        model.addAttribute("items_thitga", items_thitga);
        List<MenuMonAn> items_salad = menuMonAnService.findByCategory("salad");
        model.addAttribute("items_salad", items_salad);
        List<MenuMonAn> items_my = menuMonAnService.findByCategory("my");
        model.addAttribute("items_my", items_my);
        List<MenuMonAn> items_com = menuMonAnService.findByCategory("com");
        model.addAttribute("items_com", items_com);
        List<MenuMonAn> items_haisan = menuMonAnService.findByCategory("haisan");
        model.addAttribute("items_haisan", items_haisan);
        List<MenuMonAn> items_raucu = menuMonAnService.findByCategory("raucu");
        model.addAttribute("items_raucu", items_raucu);
        List<MenuMonAn> items_douong = menuMonAnService.findByCategory("douong");
        model.addAttribute("items_douong", items_douong);
        return "order/menu";
    }
    @GetMapping("/table/menu/{id}")
    public String addMenuToTable(HttpServletRequest request,@PathVariable("id") Integer id, Model model,
            @RequestParam("p") Optional<Integer> p) {
        if (request.getRemoteUser() != null) {
            TaiKhoan user = taiKhoanService.getOne(request.getRemoteUser());
            model.addAttribute("USER", user);
        }
        
        Ban ban = banService.findById(id);
        model.addAttribute("hoadon", banDAO.getOrderByTable(ban));
        
        List<MenuMonAn> items_thitbo = menuMonAnService.findByCategory("thitbo");
        model.addAttribute("items_thitbo", items_thitbo);
        List<MenuMonAn> items_thitheo = menuMonAnService.findByCategory("thitheo");
        model.addAttribute("items_thitheo", items_thitheo);
        List<MenuMonAn> items_thitga = menuMonAnService.findByCategory("thitga");
        model.addAttribute("items_thitga", items_thitga);
        List<MenuMonAn> items_salad = menuMonAnService.findByCategory("salad");
        model.addAttribute("items_salad", items_salad);
        List<MenuMonAn> items_my = menuMonAnService.findByCategory("my");
        model.addAttribute("items_my", items_my);
        List<MenuMonAn> items_com = menuMonAnService.findByCategory("com");
        model.addAttribute("items_com", items_com);
        List<MenuMonAn> items_haisan = menuMonAnService.findByCategory("haisan");
        model.addAttribute("items_haisan", items_haisan);
        List<MenuMonAn> items_raucu = menuMonAnService.findByCategory("raucu");
        model.addAttribute("items_raucu", items_raucu);
        List<MenuMonAn> items_douong = menuMonAnService.findByCategory("douong");
        model.addAttribute("items_douong", items_douong);
        return "table/menu";
    }
}
