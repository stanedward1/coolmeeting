package org.longbiu.meeting.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Classname DateConverter
 * @Description 类型转换
 * @Date 2021/9/11 14:33
 * @Author Longbiu
 */
public class DateConverter implements Converter<String, Date> {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public Date convert(String source) {
        try {
            return sdf.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
