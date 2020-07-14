/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.isle.sample;

/**
 * @author xuanbei 18/5/5
 */
public class SampleJvmServiceImpl implements SampleJvmService {
    private String message;

    public SampleJvmServiceImpl(String message) {
        this.message = message;
    }

    public SampleJvmServiceImpl() {
    }

    // source method
    public int gimmeTainted(int i) {
        return i;
    }

    // sink method
    public void printMyInt(int i) {
        System.out.println("Someone gave me a: " + i);
    }

    // no flow from source to sink
    public void testExample1() {
        int one = 1;
        printMyInt(one);
    }

    // flow from source to sink
    public void testExample2() {
        System.out.println("==> Expect exception");
        int tainted = gimmeTainted(2);
        printMyInt(tainted);
    }

    @Override
    public String message() {
        System.out.println(message);
        testExample1();
        testExample2();
        return message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
