package com.example.demo.headfirstdemopractice.methodinvocation;

/**
 * PackageName: com.example.demo.headfirstdemopractice.methodinvocation
 * ClassName: NoCommand
 * Author: chuyingen
 * Date: 2018/11/22 3:38 PM
 * Description:该对象是一个空对象（null Object），当我们不想返回一个有意义的对象时，空对象就很有意义，客户可以
 * 将处理null对象的任务交给空对象，当调用这个方法时 do nothing
 */
public class NoCommand implements Command {
    @Override
    public void execute() {

    }
}
