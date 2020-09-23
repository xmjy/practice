package com.xm.jy.job_51.mianTest;

import com.xm.jy.job_51.util.PropertiesUtil;
import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: albert.fang
 * @date: 2020/4/23 14:51
 * @description: 随便测试的内容，随测随删
 */
public class Test_51 {
    public static void main(String[] args) throws ParseException {
        String regular = "^(\\(\\d{3,4}\\)|\\d{3,4}-|\\s)?\\d{7,9}(-[0-9]{1,4})?$";
        System.out.println(regular);
        Pattern p = Pattern.compile(regular);
        System.out.println(p.matcher("(021)58154936").matches());

        String tel_regular = PropertiesUtil.getProperty("special_character_telphone");
        System.out.println(tel_regular);
        System.out.println(Pattern.compile(tel_regular).matcher("14257845").matches());
    }
}
