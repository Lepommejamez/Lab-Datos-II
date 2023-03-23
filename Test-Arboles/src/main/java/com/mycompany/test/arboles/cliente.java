/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.arboles;

/**
 *
 * @author lepom
 */
public class cliente extends objeto
{
    public cliente(String id_prod, String id_cat, String name, String lastname, String age, String birthdate, String gender, String estadocivil, String telefono, String celular, String email, String edulvl, String rango, String dir, boolean contactoPorEmail, boolean contactoPorTelefono, boolean contactoPorSms, boolean contactoPorCorreo) {
        super(id_prod, id_cat, name);
        data.add(3,lastname);
        data.add(4,age);
        data.add(5, birthdate);
        data.add(6, gender);
        data.add(7, estadocivil);
        data.add(8, telefono);
        data.add(9, celular);
        data.add(10, email);
        data.add(11, edulvl);
        data.add(12, rango);
        data.add(13, dir);
        data.add(14, boolToStr(contactoPorEmail));
        data.add(15, boolToStr(contactoPorTelefono));
        data.add(16, boolToStr(contactoPorSms));
        data.add(17, boolToStr(contactoPorCorreo));
    }
    
     public String getDataAtIndex(int index)
    {
       return data.get(index);
    }
    
    String boolToStr(boolean a)
    {
        if(a)
        {
            return "true";
        }
        else
        {
            return "false";
        }
    }
    
}
