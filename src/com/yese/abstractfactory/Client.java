package com.yese.abstractfactory;

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("===================小米系列产品=================");
        //小米产品工厂实例
        IProductFactory xiaomiProductFactory = new XiaomiIProductFactory();

        //生产小米手机
        IPhoneProduct xiaomiPhone = xiaomiProductFactory.produceTelPhone();
        xiaomiPhone.start();
        xiaomiPhone.callUp();
        xiaomiPhone.sendSMS();
        xiaomiPhone.shutdown();

        //生产小米路由器
        IRouterProduct xiaomiRouter = xiaomiProductFactory.produceRouter();
        xiaomiRouter.start();
        xiaomiRouter.setting();
        xiaomiRouter.openWifi();
        xiaomiRouter.shutdown();

        System.out.println("===================华为系列产品=================");
        //华为产品工厂实例
        IProductFactory huaweiProductFactory = new HuaweiIProductFactory();

        //生产华为手机
        IPhoneProduct huaweiPhone = huaweiProductFactory.produceTelPhone();
        huaweiPhone.start();
        huaweiPhone.callUp();
        huaweiPhone.sendSMS();
        huaweiPhone.shutdown();

        //生产华为路由器
        IRouterProduct huaweiRouter = huaweiProductFactory.produceRouter();
        huaweiRouter.start();
        huaweiRouter.setting();
        huaweiRouter.openWifi();
        huaweiRouter.shutdown();
    }
}