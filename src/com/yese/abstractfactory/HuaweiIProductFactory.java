package com.yese.abstractfactory;

/**
 * 华为产品工厂
 */
public class HuaweiIProductFactory implements IProductFactory {
    @Override
    public IPhoneProduct produceTelPhone() {
        System.out.println(">>>>>>生产华为手机");
        return new HuaweiIPhone();
    }

    @Override
    public IRouterProduct produceRouter() {
        System.out.println(">>>>>>生产华为路由器");
        return new HuaweiIRouter();
    }
}