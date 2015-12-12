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
 * 负整形数在Jvm中的表示
 */
public class IntegerInJvm {
    public static void main(String[] args) {
        int a = -10;
        for (int i = 0; i < 32; i++){
            // 0x80000000?
            // 0100,0000,0000,0000,0000,0000,0000,0000
            // ?????????0
            int t = (a & 0x80000000 >>> i) >>> (31 - i);
            System.out.print(t);
        }
        System.out.println();
        // ???
        System.out.println(Integer.toBinaryString(a));
    }
}
