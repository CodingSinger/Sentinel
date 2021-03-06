/*
 * Copyright 1999-2019 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.dubbo.springboot.api.impl;

import com.alibaba.csp.sentinel.dubbo.springboot.annotation.FallbackHandler;
import com.alibaba.csp.sentinel.dubbo.springboot.annotation.FlowRuleDefine;
import com.alibaba.csp.sentinel.dubbo.springboot.api.DemoService;
import org.apache.dubbo.config.annotation.Reference;


public class TestClient {
    @Reference
    @FlowRuleDefine
    @FallbackHandler(fallbackClass = DemoServiceFallback.class)
    private DemoService demoService;
}
