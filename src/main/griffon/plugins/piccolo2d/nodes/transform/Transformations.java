/*
 * Copyright 2012 the original author or authors.
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
package griffon.plugins.piccolo2d.nodes.transform;

import edu.umd.cs.piccolo.PNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Andres Almiray
 */
public class Transformations {
    private List<Transformation> transformations = new ArrayList<Transformation>();

    public void addTransformation(Transformation transformation) {
        if (transformation != null) {
            transformations.add(transformation);
        }
    }

    public List<Transformation> getTransformations() {
        return Collections.unmodifiableList(transformations);
    }

    public void apply(PNode node) {
        for (Transformation transformation : transformations) {
            transformation.apply(node);
        }
    }
}