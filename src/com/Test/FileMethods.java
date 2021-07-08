package com.Test;

import com.sun.source.tree.ReturnTree;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Author=fionajoyo
 * @Date 2021/7/6 13:32
 * @Version 1.0
 */
public class FileMethods {
    private File file;


    /**@param file:
     * @return File
     * 创建文件
     * */public File createFile (File file) throws IOException
    {
        if(!file.exists())
        {
            file.createNewFile();
            System.out.println(file.getName()+"创建成功");
        }
        else
        {
            System.out.println("文件已经存在");

        }
        return file;
    }

    /**
     * @param file:
     * @return boolean
     * 删除文件*/
    public boolean deleteFile(File file) throws  IOException
    {
        if(!file.exists())
        {
            System.out.println(file.getName()+"已经删除");
            file.delete();

        }
        else
        {
            System.out.println("文件未找到，删除失败");
            return false;
        }
        return true;
    }


    public void listDir(File file)
    {
        File[] list=file.listFiles();
        String info="";
        for(int i=0;i<list.length;i++)
        {
            info+=list[i].getName()+"\\";
        }
        System.out.println("当前目录为"+info);
    }




}
