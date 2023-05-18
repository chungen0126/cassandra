/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.cassandra.stress.generate.values;

import java.util.HashMap;
import java.util.Map;

import org.apache.cassandra.db.marshal.MapType;
import org.apache.cassandra.db.marshal.UTF8Type;
import org.apache.cassandra.stress.settings.OptionDistribution;


public class Maps<K, V> extends Generator<Map<K, V>>
{


    @SuppressWarnings("unchecked")
    public Maps(String name, GeneratorConfig config)
    {
        super(MapType.getInstance(UTF8Type.instance, UTF8Type.instance, true), config, name, Map.class);
    }

    public void setSeed(long seed)
    {
        super.setSeed(seed);
    }

    @Override
    public Map generate()
    {
        final Map map = new HashMap<K, V>();
        map.put("bin_code",new Strings("bin_code", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(1)"), null)).generate());
        map.put("bin_name",new Strings("bin_name", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(4)"), null)).generate());
        map.put("cat_code",new Strings("cat_code", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(4)"), null)).generate());
        map.put("cat_name",new Strings("cat_name", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(2)"), null)).generate());
        map.put("ori_chip_id",new Strings("ori_chip_id", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(6)"), null)).generate());
        map.put("original_chip_id",new Strings("original_chip_id", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(6)"), null)).generate());
        map.put("chip_x",new Strings("chip_x", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(6)"), null)).generate());
        map.put("original_chip_x",new Strings("original_chip_x", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("chip_y",new Strings("chip_y", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("original_chip_y",new Strings("original_chip_y", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("region_name",new Strings("region_name", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("region_name_2",new Strings("region_name_2", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(1)"), null)).generate());
        map.put("original_shot_id",new Strings("original_shot_id", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("shot_position",new Strings("shot_position", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(7)"), null)).generate());
        map.put("dut",new Strings("dut", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(2)"), null)).generate());
        map.put("sort",new Strings("sort", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(4)"), null)).generate());
        map.put("maptxt",new Strings("maptxt", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("pt_maptxt",new Strings("pt_maptxt", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(0)"), null)).generate());
        map.put("ya_random_cluster",new Strings("ya_random_cluster", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(3)"), null)).generate());
        map.put("top10_cat",new Strings("top10_cat", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(0)"), null)).generate());
        map.put("touch_down",new Strings("touch_down", new GeneratorConfig("seed for stress" + name, null, OptionDistribution.get("fixed(6)"), null)).generate());
        map.put("value",String.valueOf(new Integers("value", new GeneratorConfig("seed for stress" + name, null, null, null)).generate()));
        map.put("adder_value",String.valueOf(new Integers("adder_value", new GeneratorConfig("seed for stress" + name, null, null, null)).generate()));
        map.put("minus_value",String.valueOf(new Integers("minus_value", new GeneratorConfig("seed for stress" + name, null, null, null)).generate()));
        map.put("accu_value",String.valueOf(new Integers("accu_value", new GeneratorConfig("seed for stress" + name, null, null, null)).generate()));
        map.put("fbc_value",String.valueOf(new Integers("fbc_value", new GeneratorConfig("seed for stress" + name, null, null, null)).generate()));
        return map;
    }
}
