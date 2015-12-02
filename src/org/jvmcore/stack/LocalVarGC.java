package org.jvmcore.stack;

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
 * 打印GC信息
 *  input: -XX:+PrintGC
 */
public class LocalVarGC {

    public void localVarGc1(){
        byte[] bytes = new byte[ 6 * 1024 * 1024];
        System.gc();
    }

    public void localVarGc2(){
        byte[] bytes = new byte[ 6 * 1024 * 1024];
        bytes = null;
        System.gc();
    }

    public void localVarGc3(){
        {
            byte[] bytes = new byte[ 6 * 1024 * 1024];
        }
        System.gc();
    }

    public void localVarGc4(){
        {
            byte[] bytes = new byte[ 6 * 1024 * 1024];
        }
        int a = 4;
        System.gc();
    }

    public void localVarGc5(){
        localVarGc1();
        System.gc();
    }

    public static void main(String[] args) {
        LocalVarGC ins = new LocalVarGC();
//      ins.localVarGc1();
//      ins.localVarGc2();
//      ins.localVarGc3();
//      ins.localVarGc4();
        ins.localVarGc5();
    }
}
