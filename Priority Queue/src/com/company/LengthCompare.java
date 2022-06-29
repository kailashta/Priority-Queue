package com.company;

import java.util.Collection;
import java.util.Comparator;

public class LengthCompare implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Files file1 = (Files) o1;
        Files file2 = (Files) o2;
        if (file1.count<file2.count){
            return -1;
        }
        else if(file1.count>file2.count){
            return 1;
        }
        else{
            return 0;
        }
    }
}
