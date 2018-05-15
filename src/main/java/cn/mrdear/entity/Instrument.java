package cn.mrdear.entity;

import javax.persistence.*;
import java.io.Serializable;
@Table(name = "instrument")
public class Instrument implements Serializable {
    private static final long serialVersionUID = 4189250872871101725L;
    /**
     * ��������ID
     */
    @Id
    @Column(name="instrument_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * ��������id
     */
    private String instrument_id;
    /**
     * ����˳��
     */
    private Integer num;

    /**
     * ��ȡ��������id
     * @return
     */
    private String  xml;



    public String getInstrument_id() {
        return instrument_id;
    }

    /**
     * ������������id
     * @param instrument_id
     */
    public void setInstrument_id(String instrument_id) {
        this.instrument_id = instrument_id;
    }

    /**
     * ��������id
     * @return
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * �õ����������
     * @return
     */
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
