package cn.mrdear.service;

import cn.mrdear.entity.Fact;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author:Yang Cui
 * date 2018/5/15
 */
public interface FactService {
    /**
     * ��ѯ���е�facts
     * @return �����
     */
    List<Fact> getAll();


}
