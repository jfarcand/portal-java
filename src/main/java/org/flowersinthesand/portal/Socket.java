/*
 * Copyright 2012 Donghwan Kim
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
package org.flowersinthesand.portal;

public interface Socket {

	boolean opened();

	String param(String key);

	Socket on(String event, Fn.Callback handler);

	<A> Socket on(String event, Fn.Callback1<A> handler);

	<A, B> Socket on(String event, Fn.Callback2<A, B> handler);

	Socket send(String event);

	Socket send(String event, Object data);

	Socket send(String event, Object data, Fn.Callback callback);

	<A> Socket send(String event, Object data, Fn.Callback1<A> callback);

	void close();

}