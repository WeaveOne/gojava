package com.willvi.jai;
import	java.io.File;


import com.sun.media.jai.codec.ImageCodec;
import com.sun.media.jai.codec.ImageEncoder;
import com.sun.media.jai.codec.JPEGEncodeParam;

import javax.media.jai.JAI;
import javax.media.jai.RenderedOp;
import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * @author wangwei
 * @date 2019/10/16 14:16
 */
public class TifToJpg {
    public static void main(String[] args) throws Exception {
        String directory = "C:\\Users\\LX\\Desktop\\THB000235243";
        String directory2 = "C:\\Users\\LX\\Desktop\\THB000235243";
        File directories = new File(directory);
        File[] files = directories.listFiles();
        JPEGEncodeParam param = new JPEGEncodeParam();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
            RenderedOp src = JAI.create("fileload", file.getAbsolutePath());
            OutputStream os = new FileOutputStream(directory2 + "\\" + file.getName().substring(0, file.getName().lastIndexOf(".") + 1) + "jpg");
            ImageEncoder enc = ImageCodec.createImageEncoder("JPEG", os, param);
            enc.encode(src);
            os.flush();
            os.close();
        }
    }
}
