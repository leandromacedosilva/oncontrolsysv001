package com.oncontrolsysv001.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author leandro
 */
public class DateUtil {
    public static Date StringToDate(String dataInformada) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SS");
        Date dataFormatada = sdf.parse(dataInformada);
        return dataFormatada;
    }
}
