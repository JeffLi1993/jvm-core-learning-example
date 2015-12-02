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
 * @since 2015-12-1 19:21:24
 * 堆溢出的理解
 *  input: // -Xss128K
 */
public class StackDeep {
    private static int count = 0;
    public static void recursion(){
        count++;
        recursion();
    }

    public static void recursion(long a,long b,long c){
        long e=1,f=2,g=3,h=4,j=5,k=6,l=7,q=8,w=10,r=9;
        count++;
        recursion(a,b,c);
    }

    public static void main(String[] args) {
        try {
            // recursion(0L,0L,0L);
            recursion();
        } catch (Throwable e){
            System.out.println("counts = " + count);
            e.printStackTrace();
        }
    }
}