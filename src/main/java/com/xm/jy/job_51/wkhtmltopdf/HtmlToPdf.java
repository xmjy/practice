package com.xm.jy.job_51.wkhtmltopdf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

public class HtmlToPdf {

    private static Logger logger = LoggerFactory.getLogger(HtmlToPdf.class);

    // wkhtmltopdf在系统中的路径
    private static String toPdfTool = "D:\\Program Files\\wkhtmltopdf\\bin\\wkhtmltopdf.exe";

    /**
     * html转pdf
     * @param srcPath html路径，可以是硬盘上的路径，也可以是网络路径
     * @param destPath pdf保存路径
     * @return 转换成功返回true
     */
    public static boolean convert(String srcPath, String destPath){
        File file = new File(destPath);
        File parent = file.getParentFile();
        //如果pdf保存路径不存在，则创建路径
        if(!parent.exists()) {
            parent.mkdirs();
        }

        StringBuilder cmd = new StringBuilder();
        if(!System.getProperty("os.name").contains("Windows")){
            //非windows 系统
            toPdfTool = "/home/ubuntu/wkhtmltox/bin/wkhtmltopdf";
        }
        cmd.append(toPdfTool);
        cmd.append(" --javascript-delay 5000 ");

        cmd.append(srcPath);
        cmd.append(" ");
        cmd.append(destPath);

        boolean result = true;
        try{
            Process proc = Runtime.getRuntime().exec(cmd.toString());
            HtmlToPdfInterceptor error = new HtmlToPdfInterceptor(proc.getErrorStream());
            HtmlToPdfInterceptor output = new HtmlToPdfInterceptor(proc.getInputStream());
            error.start();
            output.start();
            proc.waitFor();
        }catch(Exception e){
            logger.error("html转成pdf失败");
            result = false;
            e.printStackTrace();
        }
        return result;
    }
        public static void main(String[] args) {
            String pdfName = System.currentTimeMillis()+".pdf";
//            String dest = "\\10.100.50.123\\javaWork\\HRdocument\\B端资料\\";
            String dest = "E:\\javaWork\\0413智鼎项目文档（个人）\\wkhtmltopdf\\";
            System.out.println(HtmlToPdf.convert("http://10.100.3.153/db-relations.html#zdtest_relations.t_activity_combinationproduct/", dest + pdfName));
        }
    }