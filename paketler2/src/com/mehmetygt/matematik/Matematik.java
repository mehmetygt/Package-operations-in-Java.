
package com.mehmetygt.matematik;

public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
       System.out.println("Toplama sonucu : "+(a+b));
    }

    @Override
    public void cikarma(int a, int b) {
      System.out.println("Cıkarma sonucu : "+(a-b));
    }

    @Override
    public void carpma(int a, int b) {
       System.out.println("Carpma sonucu : "+(a*b));
    }

    @Override
    public void bolme(int a, int b) {
       System.out.println("Bölme sonucu : "+(double)(a/b));
    }
    
}
/* bu paketi jar dosyasına çevirip başka bir pakete kütüphane olarak import edeceğiz*/