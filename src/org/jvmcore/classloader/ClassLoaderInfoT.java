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
 * @since 2015-12-1 19:00:40
 * 打印类加载器信息
 */
public class ClassLoaderInfoT {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println("当前类加载器：" + loader);
        System.out.println("当前类的父亲加载器（根加载器）：" + loader.getParent());
        System.out.println("当前类父亲的父亲加载器（无）：" + loader.getParent().getParent());
    }
}
