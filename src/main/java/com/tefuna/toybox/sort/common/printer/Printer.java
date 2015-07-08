package com.tefuna.toybox.sort.common.printer;

import java.util.ArrayList;
import java.util.List;


import com.tefuna.toybox.sort.common.constant.SortMethod;
import com.tefuna.toybox.sort.common.constant.SortName;
import com.tefuna.toybox.sort.common.constant.SortOperation;

import com.tefuna.toybox.sort.common.element.SortElement;

/**
 *
 * @author tefuna
 *
 */
public interface Printer {

    /**
     *
     * @param sortName
     * @return
     */
    public void setSortName(SortName sortName);

    /**
     *
     * @param sortMethod
     * @return
     */
    public void setSortMethod(SortMethod sortMethod);

    /**
     *
     * @param msec
     * @return
     */
    public void setTimeSpent(long msec);

    /**
     *
     * @param array
     * @return
     */
    public void setArray(SortElement[] array);

    /**
     *
     * @param original
     */
    public void setOriginal(SortElement[] original);

    /**
     *
     * @param complete
     */
    public void setComplete(SortElement[] complete);

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public void setStepExchanging(SortElement a, SortElement b, SortOperation ope);


    public void setStepAsExchangeList(List<SortElement> exchangeList);


    // public String printStepExchanging(SortElement a, SortElement b);
    // public String printStepExchanging(SortElement a, SortElement b);
    // public String printStepExchanging(SortElement a, SortElement b);

    /**
     *
     * @param id
     * @param sorted
     */
    public void updateSorted(int id, boolean sorted);

    /**
     *
     * @return
     */
    public String printAll();
}
