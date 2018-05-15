package cn.mrdear.controller;

import cn.mrdear.entity.Fact;
import cn.mrdear.service.FactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FactController {
    @Autowired
    @Qualifier("factService") //这里使用Qualifier注解注入factService业务层
    private FactService factService;

    @RequestMapping("/main") //处理main请求
    public String main(Model model){
        List<Fact> facts=factService.getAll();
        System.out.println(facts);
        model.addAttribute("facts",facts);//把从数据库取到的数据放入到model中
        return  "main";
    }

}
