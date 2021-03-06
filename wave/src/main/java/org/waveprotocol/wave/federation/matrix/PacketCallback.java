/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.waveprotocol.wave.federation.matrix;

import org.json.JSONObject;
import org.waveprotocol.wave.federation.FederationErrorProto.FederationError;

/**
 * Simple callback type used for receiving reliable Matrix JSON
 * packets. This allows for clearly defined success and failure states.
 *
 * @author khwaqee@gmail.com (Waqee Khalid)
 */
public interface PacketCallback {
  void run(JSONObject packet);
  void error(FederationError error);
}