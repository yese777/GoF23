package com.yese.abstractfactory;

/**
 * 抽象产品工厂（定义了同一个产品族的产品生产行为）
 */
public interface IProductFactory {

    /**
     * 生产手机
     */
    IPhoneProduct produceTelPhone();

    /**
     * 生产路由器
     */
    IRouterProduct produceRouter();

}