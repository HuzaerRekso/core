package com.huzaer.core.payload;

import com.huzaer.core.BaseObject;

/**
 * @author  Mohammad Huzaer Rekso Jiwo
 * @version 0.1
 * @since   2022-04-02
 */
public class Paging extends BaseObject {

    private int page;

    private int totalpage;

    private long totalrecord;

    public Paging() {
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalpage() {
        return totalpage;
    }

    public void setTotalpage(int totalpage) {
        this.totalpage = totalpage;
    }

    public long getTotalrecord() {
        return totalrecord;
    }

    public void setTotalrecord(long totalrecord) {
        this.totalrecord = totalrecord;
    }

}
