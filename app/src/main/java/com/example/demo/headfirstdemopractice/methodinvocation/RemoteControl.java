package com.example.demo.headfirstdemopractice.methodinvocation;

import java.util.Arrays;

/**
 * PackageName: com.example.demo.headfirstdemopractice.methodinvocation
 * ClassName: RemoteControl
 * Author: chuyingen
 * Date: 2018/11/22 3:36 PM
 * Description:将每个按键对应到每个命令
 */
public class RemoteControl {
    Command[] onCommand;
    Command[] offCommand;

    public RemoteControl() {
        onCommand = new Command[7];
        offCommand = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommand.length; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }

    public void setCommand(int slot,Command sonCommand,Command soffCommand){
        onCommand[slot] = sonCommand;
        offCommand[slot] = soffCommand;
    }

    public void onButtonPushed(int slot){
        onCommand[slot].execute();
    }

    public void offButtonPushed(int slot){
        offCommand[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommand=" + Arrays.toString(onCommand) +
                ", offCommand=" + Arrays.toString(offCommand) +
                '}';
    }
}
