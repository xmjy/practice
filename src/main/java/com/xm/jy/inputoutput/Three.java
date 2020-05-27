package com.xm.jy.inputoutput;


import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @ClassName: Three
 * @Description: description of class
 * @Author: Albert
 * @CreateDate: 2019/12/31 17:21
 */
public class Three implements Serializable{
    public static void main(String[] args) throws IOException {
        File file = new File("F:\\2.txt");
        FileChannel inChannel = new FileInputStream(file).getChannel();
        FileChannel outChannel = new FileOutputStream("F:\\3.txt").getChannel();
        MappedByteBuffer byteBuffer = inChannel.map(FileChannel.MapMode.READ_ONLY,0,file.length());
        Charset charset = Charset.forName("GBK");
        outChannel.write(byteBuffer);
        byteBuffer.clear();
        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer charBuffer = decoder.decode(byteBuffer);
        System.out.println(charBuffer);
    }
}
