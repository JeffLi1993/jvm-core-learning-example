package org.jvmcore.heap;

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
 * @since 2015-12-1 19:01:44
 * 打印堆内存
 *  input: java -Xmx33m org.jvmcore.heap.JvmXmxArgs a b
 *  打印始终小于 33M , 因为GC在不同区域采用不同回收算法，可用内存的减少为了其使用空间换时间的策略。
 */
public class JvmXmxArgs {
    public static void main(String[] args) {
        for (String arg : args)
            System.out.println("参数为" + arg);
        // 堆内存
        System.out.println("-Xmx:" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
    }
}
