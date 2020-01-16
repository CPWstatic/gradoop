/*
 * Copyright © 2014 - 2020 Leipzig University (Database Research Group)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gradoop.common.model.impl.pojo;

import org.gradoop.common.model.api.entities.GraphHead;
import org.gradoop.common.model.impl.id.GradoopId;
import org.gradoop.common.model.impl.properties.Properties;

/**
 * POJO Implementation of an EPGM graph head.
 */
public class EPGMGraphHead extends EPGMElement implements GraphHead {

  /**
   * Default constructor.
   */
  public EPGMGraphHead() {
  }

  /**
   * Creates a graph head based on the given parameters.
   *
   * @param id         graph identifier
   * @param label      graph label
   * @param properties graph properties
   */
  public EPGMGraphHead(final GradoopId id, final String label,
    final Properties properties) {
    super(id, label, properties);
  }

  @Override
  public String toString() {
    return super.toString() + "[]";
  }
}
