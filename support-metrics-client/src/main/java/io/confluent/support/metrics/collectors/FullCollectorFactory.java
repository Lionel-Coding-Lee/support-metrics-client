/**
 * Copyright 2015 Confluent Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.confluent.support.metrics.collectors;

import java.util.Properties;

import io.confluent.support.metrics.common.Collector;
import io.confluent.support.metrics.common.time.TimeUtils;
import kafka.server.KafkaServer;

public class FullCollectorFactory {

    public FullCollectorFactory(){};

    public Collector getFullCollector(KafkaServer server,
                                      Properties serverConfiguration,
                                      Runtime serverRuntime,
                                      TimeUtils time) {
        return new FullCollector(server, serverConfiguration, serverRuntime, time);
    }

}
