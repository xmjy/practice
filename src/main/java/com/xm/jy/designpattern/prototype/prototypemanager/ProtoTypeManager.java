package com.xm.jy.designpattern.prototype.prototypemanager;

import lombok.Data;

import java.util.HashMap;

/**
 * @author: albert.fang
 * @date: 2021/1/11 15:53
 * @description: 原型管理器：单例模式，所有请求共用一个；用double checked locking（逼格满满）
 */
@Data
public class ProtoTypeManager {
    private HashMap<String,OfficialDocument> hashMap = new HashMap<>();
    private static volatile ProtoTypeManager protoTypeManager;
    private ProtoTypeManager(){
        hashMap.put("far",new FAR());
        hashMap.put("srs",new SRS());
    }
    public static ProtoTypeManager getInstance(){
        if (protoTypeManager == null){
            synchronized (ProtoTypeManager.class){
                if (protoTypeManager == null){
                    protoTypeManager = new ProtoTypeManager();
                }
            }
        }
        return protoTypeManager;
    }

    /**
     * 给原型对象管理器新增一个公文对象：OfficialDocument
     * @param key
     * @param document
     */
    public void addOfficialDocument(String key,OfficialDocument document){
        hashMap.put(key,document);
    }

    /**
     * 通过浅克隆获取新的公文对象
     * @param key
     * @return
     */
    public OfficialDocument getOfficialDocument(String key){
        return hashMap.get(key).clone();
    }


}
