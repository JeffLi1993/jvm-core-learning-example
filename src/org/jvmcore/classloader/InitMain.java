package org.jvmcore.classloader;

/*
 * Copyright [2015] [Jeff Lee]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Jeff Lee
 * @since 2015-12-4 12:55:07
 * 子类的初始化过程和主动引用：
 *   子类初始化，先初始化父类
 *   input: java -XX:+TraceClassLoading 加载信息
 */
class Parent {
    static {
        System.out.println("Parent init");
    }
    public static int v = 100;
}
class Child extends Parent {
    static {
        System.out.println("Child  init");
    }
}
public class InitMain {
    public static void main(String[] args) {
        //new Child();// new关键字初始化 注释开启和未开启作比较
        System.out.println("======");
        System.out.println(Child.v); // 此时Child已经被加载，但未被初始化
    }
}
