package cn.mrdear.entity;

import javax.persistence.*;
import java.io.Serializable;


/**
 * author:Yang Cui
 * date 2018/5/13
 */
@Table(name="fact")
public class Fact implements Serializable{
    private static final long serialVersionUID = 4189250872871101725L;
    /**
     * 事实id
     */
    private int fact_id;
    /**
     * 文书名称id
     */
    private int instrument_id;
    /**
     * 事实的内容
     */
    private String text;
    /**
     * 属于事实几
     */
    private int num;

    /**
     * 获取事实的id
     * @return
     */
    public int getFact_id() {
        return fact_id;
    }

    public void setFact_id(int fact_id) {
        this.fact_id = fact_id;
    }

    /**
     * 获取文件名称
     * @return
     */
    public int getInstrument_id() {
        return instrument_id;
    }

    public void setInstrument_id(int instrument_id) {
        this.instrument_id = instrument_id;
    }

    /**
     *获取事实的具体内容
     * @return
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * 获取事实属于事实几
     * @return
     */
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
