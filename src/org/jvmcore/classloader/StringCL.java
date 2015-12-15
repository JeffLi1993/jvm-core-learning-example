package org.jvmcore.classloader; /*
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

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author BYSocket
 * @since 2015-12-15 13:18:00
 *  类加载 - Class.forName
 */
public class StringCL {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clzStr = Class.forName("java.lang.String");
        // 返回对象方法数组
        Method[] methods = clzStr.getDeclaredMethods();
        for (Method m : methods) {
            // 获取修饰符标志的字符串
            String mod = Modifier.toString(m.getModifiers());
            System.out.print(mod + " " + m.getName() + "(");
            Class<?>[] ps = m.getParameterTypes();
            if (ps.length == 0)
                System.out.print(')');
            for (int i = 0; i < ps.length;i++) {
                char end = i == ps.length -1 ? ')':',';
                System.out.print(ps[i].getSimpleName() + end);
            }
            System.out.println();
        }
    }
}
