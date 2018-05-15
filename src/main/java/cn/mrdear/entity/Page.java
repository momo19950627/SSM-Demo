package cn.mrdear.entity;

import java.io.Serializable;

public class Page implements Serializable{
    private static final long serialVersionUID=1L;
    private int pageNow=1;//当前的页数
    private int pageSize=8;//每页显示的页数
    private int totalcount;//总记录数
    private int totalPageCount;//总页数
    private int startPos; //开始位置,从0开始
    private boolean hasFirst;//是否有首页
    private boolean hasPre;//是否有前一页
    private boolean hasNext;//是否有后一页;
    private boolean hasLast; //是否有尾页



    /**
     * 通过构造函数，传入总记录数和当前页
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
    //取得选择记录的初始位置
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
     * 是否有前一页
     * @return
     */
    //如果有首页就有前一页,因为有首页就不是第一页
    public boolean isHasPre() {
        return isHasFirst()?true:false;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    /**
     * 是否有下一页
     * @return
     */
    //如果有尾页就有下一页
    public boolean isHasNext() {
        return isHasNext()?true:false;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }
    //判断是否有尾页
    public boolean isHasLast() {
        return (pageNow==getTotalPageCount())?false:true;
    }
    public void setHasLast(boolean hasLast) {
        this.hasLast = hasLast;
    }
}
