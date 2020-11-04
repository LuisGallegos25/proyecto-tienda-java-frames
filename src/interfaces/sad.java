/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class sad {
    public static void main(String[] args) {
        Date fecha = new Date();
DateFormat formato = DateFormat.getDateInstance(DateFormat.FULL);
System.out.println(formato.format(fecha));
    }
}
