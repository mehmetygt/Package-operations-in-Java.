
package com.mehmetygt.paket1;

import com.mehmetygt.paket2.AdayOgrenci;
// AdayOgrenci interface'ibaşka pakette olduğu için import edildi


public class Ogrenci implements AdayOgrenci{

    @Override
    public void ders_calis() {
        System.out.println("ders çalışılıyor");
    }
    
}
