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
    @Qualifier("factService") //����ʹ��Qualifierע��ע��factServiceҵ���
    private FactService factService;

    @RequestMapping("/main") //����main����
    public String main(Model model){
        List<Fact> facts=factService.getAll();
        System.out.println(facts);
        model.addAttribute("facts",facts);//�Ѵ����ݿ�ȡ�������ݷ��뵽model��
        return  "main";
    }

}
