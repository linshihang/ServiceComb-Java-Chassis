/*
 * Copyright 2017 Huawei Technologies Co., Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.servicecomb.foundation.metrics;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

import io.servicecomb.foundation.metrics.output.servo.SimpleMetricsContentFormatter;

public class TestSimpleMetricsContentFormatter {

  @Test
  public void testFormatter() {
    SimpleMetricsContentFormatter formatter = new SimpleMetricsContentFormatter();

    Map<String, String> input = new HashMap<>();
    input.put("key", "value");

    Map<String, String> output = formatter.format(input);

    Assert.assertTrue(output.containsKey("key"));
    Assert.assertTrue(output.get("key").contains("\"key\":\"value\""));
  }
}
