package com.lxg.common.bean;

import com.lxg.common.constant.RuleCode;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  * Created by xuegangliu on 2017/11/2.
 */
public class RuleObject extends RuleBase implements Serializable{

    public Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public RuleObject() {
        super();
    }

    public RuleObject(Object data) {
        this();
        this.data = data;
    }

    public static RuleObject returnResultObject(boolean code) {
        String value = RuleCode.getByCode(code).getMessage();
        return new RuleObject(code, value);
    }

    public RuleObject(Enum<?>[] ens) {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        for (Enum<?> en : ens) {
            Map<String, Object> map = enumToMap(en);
            list.add(map);
        }
        data = list;
    }

    private Map<String, Object> enumToMap(Enum<?> en) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            BeanInfo info = Introspector.getBeanInfo(en.getClass());
            PropertyDescriptor[] descriptors = info.getPropertyDescriptors();
            for (PropertyDescriptor property : descriptors) {
                if (property.getPropertyType().getName().equals("java.lang.Class"))
                    continue;

                Object value = property.getReadMethod().invoke(en, new Object[]{});
                map.put(property.getName(), value);
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return map;
    }


    public RuleObject(boolean code, Exception e) {
        super(code, e.toString());
    }


    public RuleObject(boolean code, String message) {
        super(code, message);
    }

    public RuleObject(boolean code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("code", this.code);
        map.put("message", this.message);
        map.put("data", data);
        return map;
    }
}
