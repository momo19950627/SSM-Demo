package cn.mrdear.mapper;

import cn.mrdear.entity.Fact;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface FactMapper extends Mapper<Fact>{
    @Select("select * from fact limit 10") //ÓÃSelect À´×¢½âÓï¾ä
    List <Fact> findAll();

}
