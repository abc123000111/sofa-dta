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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xuanbei 18/5/5
 */
@SpringBootApplication
public class ApplicationRun {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ApplicationRun.class);
        springApplication.run(args);
    }
}

/**
 * Sync:
 * 1、Phosphor与sofa（springboot）的兼容性
 * 精简代码、错误报告（重现bug）
 * 2、Developer guide
 * 设计模式、高层架构、功能扩展，documentation，业务适配需求可以咨询，具体我们推动
 * javaagent，ASM 视频会议
 */