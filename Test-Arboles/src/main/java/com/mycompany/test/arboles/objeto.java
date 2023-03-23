/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.arboles;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author lepom
 */
public class objeto 
{
    public ArrayList<String> data;

    public objeto(String id_prod, String id_cat, String name) {
        data = new ArrayList();
        data.add(0,id_prod);
        data.add(1,id_cat);
        data.add(2,name);
    }
    
}