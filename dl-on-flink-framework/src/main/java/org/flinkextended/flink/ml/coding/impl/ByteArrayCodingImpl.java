/*
 * Copyright 2022 Deep Learning on Flink Authors
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

package org.flinkextended.flink.ml.coding.impl;

import org.flinkextended.flink.ml.cluster.node.MLContext;
import org.flinkextended.flink.ml.coding.Coding;
import org.flinkextended.flink.ml.coding.CodingException;

/** coding object with byte[] format. */
public class ByteArrayCodingImpl implements Coding<byte[]> {
    private MLContext context;

    public ByteArrayCodingImpl(MLContext context) {
        this.context = context;
    }

    @Override
    public byte[] decode(byte[] bytes) throws CodingException {
        return bytes;
    }

    @Override
    public byte[] encode(byte[] object) throws CodingException {
        return object;
    }
}
