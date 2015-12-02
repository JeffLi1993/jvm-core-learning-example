package org.jvmcore.memory;

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
 * @since 2015-12-1 19:11:36
 * 输出浮点数在虚拟机的实际表示
 */
public class FloatInJvm {
    public static void main(String[] args) {
        float a = -5;
        // 输出-5的补码，即虚拟机内部实际表示
        System.out.println(Integer.toBinaryString(Float.floatToRawIntBits(a)));
    }
}
