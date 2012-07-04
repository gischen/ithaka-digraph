/*
 * Copyright 2012 Odysseus Software GmbH
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
package de.odysseus.ithaka.digraph.fas;

import de.odysseus.ithaka.digraph.Digraph;
import de.odysseus.ithaka.digraph.UnmodifiableDigraph;

public class FeedbackArcSet<V, E> extends UnmodifiableDigraph<V, E> {
	private final FeedbackArcSetPolicy policy;
	private final boolean exact;
	private final int weight;
	
	public FeedbackArcSet(Digraph<V, E> feedback, int weight, FeedbackArcSetPolicy policy, boolean exact) {
		super(feedback);
		this.weight = weight;
		this.policy = policy;
		this.exact = exact;
	}

	public boolean isExact() {
		return exact;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public FeedbackArcSetPolicy getPolicy() {
		return policy;
	}
}
