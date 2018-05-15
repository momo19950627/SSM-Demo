package cn.mrdear.entity;

import java.io.Serializable;

public class Page implements Serializable{
    private static final long serialVersionUID=1L;
    private int pageNow=1;//��ǰ��ҳ��
    private int pageSize=8;//ÿҳ��ʾ��ҳ��
    private int totalcount;//�ܼ�¼��
    private int totalPageCount;//��ҳ��
    private int startPos; //��ʼλ��,��0��ʼ
    private boolean hasFirst;//�Ƿ�����ҳ
    private boolean hasPre;//�Ƿ���ǰһҳ
    private boolean hasNext;//�Ƿ��к�һҳ;
    private boolean hasLast; //�Ƿ���βҳ



    /**
     * ͨ�����캯���������ܼ�¼���͵�ǰҳ
     * @param pageNow
     * @param totalcount
     */
    public Page(int pageNow,int totalcount){
        super();
        this.pageNow=pageNow;
        this.totalcount=totalcount;
    }
    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalcount() {
        return totalcount;
    }

    public void setTotalcount(int totalcount) {
        this.totalcount = totalcount;
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }
    //ȡ��ѡ���¼�ĳ�ʼλ��
    public int getStartPos(){
     return (pageNow-1)*pageSize;
    }
    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }
    public boolean isHasFirst() {
        return (pageNow==1)?false:true
                ;
    }

    public void setHasFirst(boolean hasFirst) {
        this.hasFirst = hasFirst;
    }

    /**
     * �Ƿ���ǰһҳ
     * @return
     */
    //�������ҳ����ǰһҳ,��Ϊ����ҳ�Ͳ��ǵ�һҳ
    public boolean isHasPre() {
        return isHasFirst()?true:false;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    /**
     * �Ƿ�����һҳ
     * @return
     */
    //�����βҳ������һҳ
    public boolean isHasNext() {
        return isHasNext()?true:false;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
    //�ж��Ƿ���βҳ
    public boolean isHasLast() {
        return (pageNow==getTotalPageCount())?false:true;
    }
    public void setHasLast(boolean hasLast) {
        this.hasLast = hasLast;
    }
}
