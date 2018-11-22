package com.example.demo.headfirstdemopractice.methodinvocation;

/**
 * PackageName: com.example.demo.headfirstdemopractice.methodinvocation
 * ClassName: SimpleRemoteControl
 * Author: chuyingen
 * Date: 2018/11/22 3:17 PM
 * Description:
 */
public class SimpleRemoteControl {
    Command solt;

    public SimpleRemoteControl() {
    }

    public Command getSolt() {
        return solt;
    }

    public void setSolt(Command solt) {
        this.solt = solt;
    }

    public void buttonPressed(){
        solt.execute();
    }
}
