package com.example.demo.headfirstdemopractice.methodinvocation;

/**
 * PackageName: com.example.demo.headfirstdemopractice.methodinvocation
 * ClassName: LightOffCommand
 * Author: chuyingen
 * Date: 2018/11/22 3:51 PM
 * Description:
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
