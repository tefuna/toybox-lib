package com.tefuna.toybox.sort.common.constant;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SortName {

    UNDEFINED("99", "--"),
    BUBBLE_SORT("01", "bubble sort"),
    SELECTION_SORT("02", "selection sort"),
    INSERTION_SORT("03", "insertion sort"),
    QUICK_SORT("04", "quick sort"),
    MERGE_SORT("05", "merge sort"),
    HEAP_SORT("06", "heap sort"),
    SHELL_SORT("11", "shell sort"),
    SHAKER_SORT("12", "shaker sort"),
    GNOME_SORT("13", "gnome sort"),
    BITONIC_SORT("14", "bitonic sort"),
    BOGO_SORT("15", "bogo sort"),
    ODDEVEN_SORT("16", "odd-even sort");

    private String value;
    private String dispName;

    private SortName(String value, String dispName) {
        this.value = value;
        this.dispName = dispName;
    }

    public String getValue() {
        return this.value;
    }

    @JsonValue
    public String getDispName() {
        return this.dispName;
    }

}
