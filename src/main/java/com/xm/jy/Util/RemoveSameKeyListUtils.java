package com.xm.jy.Util;

import com.xm.jy.model.College;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: RemoveSameKeyListUtils
 * @Description: 移除相同属性的list
 * @Author: 方翔鸣
 * @CreateDate: 2019/11/21 13:51
 */
public class RemoveSameKeyListUtils {
    /**
     * 去除重复key(对象中的某个值)，并且合并value(想要合并的某个对象的int属性值)
     * @param oldList
     * @return
     */
    public static List<College> getNewList(List<College> oldList){
        HashMap<String,College> tempMap = new HashMap<String,College>();
        //去掉重复的key
        for(College College : oldList){
            String temp = College.getCollegeName();
            //containsKey(Object key)该方法判断Map集合中是否包含指定的键名，如果包含返回true，不包含返回false
            //containsValue(Object value)该方法判断Map集合中是否包含指定的键值，如果包含返回true，不包含返回false
            if(tempMap.containsKey(temp)){
                College newCollege = new College();
                newCollege.setCollegeName(temp);
                //合并相同key的value
                newCollege.setCountNum(tempMap.get(temp).getCountNum() + College.getCountNum());
                //HashMap不允许key重复，当有key重复时，前面key对应的value值会被覆盖
                tempMap.put(temp,newCollege );
            }else{
                tempMap.put(temp,College );
            }
        }
        //去除重复key的list
        List<College> newList = new ArrayList<College>();
        for(String temp:tempMap.keySet()){
            newList.add(tempMap.get(temp));
        }
        Collections.sort(newList);
        List<College> acadtoLibraryList = newList.subList(0,3);
        return acadtoLibraryList;
    }

}
