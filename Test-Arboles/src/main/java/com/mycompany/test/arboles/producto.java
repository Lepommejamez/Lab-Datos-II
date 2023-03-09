/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test.arboles;

/**
 *
 * @author lepom
 */
public class producto extends objeto
{   
    public producto(String id_prod, String id_cat, String name, String shortDesc, String longDesc) 
    {
        super(id_prod, id_cat, name);
        data.add(3,shortDesc);
        data.add(4,longDesc);
    }
}

