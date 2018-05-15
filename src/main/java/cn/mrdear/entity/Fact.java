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
     * ��ʵid
     */
    private int fact_id;
    /**
     * ��������id
     */
    private int instrument_id;
    /**
     * ��ʵ������
     */
    private String text;
    /**
     * ������ʵ��
     */
    private int num;

    /**
     * ��ȡ��ʵ��id
     * @return
     */
    public int getFact_id() {
        return fact_id;
    }

    public void setFact_id(int fact_id) {
        this.fact_id = fact_id;
    }

    /**
     * ��ȡ�ļ�����
     * @return
     */
    public int getInstrument_id() {
        return instrument_id;
    }

    public void setInstrument_id(int instrument_id) {
        this.instrument_id = instrument_id;
    }

    /**
     *��ȡ��ʵ�ľ�������
     * @return
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * ��ȡ��ʵ������ʵ��
     * @return
     */
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
