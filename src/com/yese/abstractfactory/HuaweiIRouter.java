package com.yese.abstractfactory;

/**
 * 华为路由器产品
 */
public class HuaweiIRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动华为路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭华为路由器");
    }

    @Override
    public void openWifi() {
        System.out.println("打开华为路由器的wifi功能");
    }

    @Override
    public void setting() {
        System.out.println("设置华为路由器参数");
    }
}