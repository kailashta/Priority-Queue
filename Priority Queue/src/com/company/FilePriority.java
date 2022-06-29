package com.company;

import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FilePriority {


    PriorityQueue<Files> fileInfo = new PriorityQueue<Files>(new LengthCompare());
    public void filePriority(){
        File filePath = new File("D://Priority queue");
        String name[] = filePath.list();
        for (int i=0;i< name.length;i++){
            int count =0;
            try {
                FileReader reader = new FileReader("D://Priority queue/"+name[i]);
                while(reader.read() != - 1){
                    count++;
                }
                reader.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            Files file = new Files(name[i] , count);
            fileInfo.add(file);
            int n=fileInfo.size();
            for(int k=0;k<n;k++){
                System.out.println("hi");
                System.out.println(fileInfo.poll());
            }
        }
    }
}
