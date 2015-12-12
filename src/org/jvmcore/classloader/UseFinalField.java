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
 * @since 2015-12-4 13:17:49
 *  Final字段不会被引起初始化
 */
class FinalFieldClass {
    public static final String CONST_STR = "CONSTSTR";

    static {
        System.out.println("FinalFieldClass init");
    }
}
public class UseFinalField {
    public static void main(String[] args) {
        System.out.println(FinalFieldClass.CONST_STR);
    }
}
