package com.tefuna.toybox.sort;

import java.util.Arrays;

import com.tefuna.toybox.sort.common.constant.SortMethod;
import com.tefuna.toybox.sort.common.constant.SortName;
import com.tefuna.toybox.sort.common.element.SortElement;
import com.tefuna.toybox.sort.common.printer.Printer;
import com.tefuna.toybox.sort.common.printer.DefaultPrinter;

abstract public class AbstractSort {

    private Printer printer;

    /**
     *
     * @param original
     * @return
     */
    public SortElement[] execute(SortElement[] original, SortElement[] array) {

        if (array == null || array.length <= 1) {
            throw new IllegalArgumentException("args error.");
        }

        if (printer == null) {
            printer = new DefaultPrinter();
        }

        printer.setSortName(getSortName());
        printer.setSortMethod(getSortMethod());
        printer.setOriginal(original);

        long start = System.currentTimeMillis();
        sort(array);
        long end = System.currentTimeMillis();

        printer.setComplete(array);
        printer.setTimeSpent(end - start);

        return array;
    }

    /**
     *
     * @param array
     * @return
     */
    abstract public SortElement[] sort(SortElement[] array);

    /**
     *
     * @return
     */
    abstract public SortName getSortName();

    /**
     *
     * @return
     */
    abstract public SortMethod getSortMethod();

    /**
     *
     * @param arrayPrinter
     */
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    /**
     *
     * @return
     */
    public Printer getPrinter() {
        return this.printer;
    }

    /**
     *
     * @param a
     * @param b
     */
    public void swapSortElement(SortElement a, SortElement b) {

        int tId = a.getId();
        int tValue = a.getValue();
        int tPrePosition = a.getPrePosition();
        // int tPosition = a.getPosition();
        // boolean tSorted = a.isSorted();

        a.setId(b.getId());
        a.setValue(b.getValue());
        a.setPrePosition(b.getPosition());

        b.setValue(tValue);
        b.setId(tId);
        b.setPrePosition(tPrePosition);
    }


    public void insertSortElement(SortElement[] array, int from, int to) {
      for (int i = from; i > to; i--) {
        swapSortElement(array[i-1], array[i]);
      }
    }
}