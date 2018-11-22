package com.example.demo.headfirstdemopractice.methodinvocation;

/**
 * PackageName: com.example.demo.headfirstdemopractice.methodinvocation
 * ClassName: LightOnCommand
 * Author: chuyingen
 * Date: 2018/11/22 3:12 PM
 * Description:假如有个打开点灯开关的命令，有on{}和off{};
 */
public class LightOnCommand implements Command {
    Light light;


    /**
     * 构造器传参
     * @param light
     */
    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
