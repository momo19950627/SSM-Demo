package cn.mrdear.entity;

import javax.persistence.*;
import java.io.Serializable;
@Table(name = "instrument")
public class Instrument implements Serializable {
    private static final long serialVersionUID = 4189250872871101725L;
    /**
     * 文书名称ID
     */
    @Id
    @Column(name="instrument_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /**
     * 文书名称id
     */
    private String instrument_id;
    /**
     * 文书顺序
     */
    private Integer num;

    /**
     * 获取文书名称id
     * @return
     */
    private String  xml;



    public String getInstrument_id() {
        return instrument_id;
    }

    /**
     * 设置文书名称id
     * @param instrument_id
     */
    public void setInstrument_id(String instrument_id) {
        this.instrument_id = instrument_id;
    }

    /**
     * 获得文书的id
     * @return
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 得到文书的名称
     * @return
     */
    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }
}
