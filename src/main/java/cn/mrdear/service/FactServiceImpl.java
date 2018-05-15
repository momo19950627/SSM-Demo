package cn.mrdear.service;

import cn.mrdear.entity.Fact;
import cn.mrdear.mapper.FactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:YangCui
 * date:2018/5/15
 */
@Service("factService")
public class FactServiceImpl implements FactService {
    @Autowired
    private FactMapper factMapper; //ÓÃAutowired×¢Èësql²ã
    @Override
    public List<Fact> getAll(){
        return factMapper.findAll();
    }

}
