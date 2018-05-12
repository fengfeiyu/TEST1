package com.phone;
//指纹手机工厂
public class ZhiWenFactory extends PhoneFactory {


    @Override
    public HuaWei getHuaWei() {
        return new HuaweiP20();
    }

    @Override
    public Iphone getIphone() {
        return new IphoneX();
    }
}
