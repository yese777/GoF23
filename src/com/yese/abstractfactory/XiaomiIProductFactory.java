package com.yese.abstractfactory;

/**
 * 小米产品工厂
 */
public class XiaomiIProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产小米手机");
        return new XiaomiIPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产小米路由器");
        return new XiaomiIRouter();
    }
}