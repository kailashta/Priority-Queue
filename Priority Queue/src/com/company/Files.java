package com.company;

public class Files {
     String name;
     int count;
//
////    public String getName() {
////        return name;
////    }
//
//    public void setName(String name) {

    @Override
    public String toString() {
        return  name + " "+count;
    }
//        this.name = name;
//    }
//
////    public int getCount() {
////        return count;
////    }
//
//    public void setCount(int count) {
//        this.count = count;
//    }

    public Files(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
