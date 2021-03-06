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
package com.github.flowersinthesand.portal.atmosphere;

import com.github.flowersinthesand.portal.App;
import com.github.flowersinthesand.portal.Fn.Callback;
import com.github.flowersinthesand.portal.Fn.Callback1;
import com.github.flowersinthesand.portal.Socket;
import com.github.flowersinthesand.portal.SocketManager;

public class NoOpSocketManager implements SocketManager {

	@Override
	public void setApp(App app) {}

	@Override
	public boolean opened(Socket socket) {
		return false;
	}

	@Override
	public void send(Socket socket, String event, Object data) {}

	@Override
	public void send(Socket socket, String event, Object data, Callback callback) {}

	@Override
	public <A> void send(Socket socket, String event, Object data, Callback1<A> callback) {}

	@Override
	public void close(Socket socket) {}

}
