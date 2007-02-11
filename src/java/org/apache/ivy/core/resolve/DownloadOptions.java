/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.ivy.core.resolve;

import java.io.File;

import org.apache.ivy.core.cache.CacheManager;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.settings.IvySettings;

public class DownloadOptions {
	private IvySettings _settings;
	private CacheManager _cacheManager;
	private EventManager _eventManager = null; // can be null
	private boolean _useOrigin = false;

	public DownloadOptions(IvySettings settings, File cache) {
		this(settings, new CacheManager(settings, cache));
	}
	
	public DownloadOptions(IvySettings settings, CacheManager cacheManager) {
		this(settings, cacheManager, null, false);
	}
	
	public DownloadOptions(IvySettings settings, CacheManager cacheManager, EventManager eventManager, boolean useOrigin) {
		_settings = settings;
		_cacheManager = cacheManager;
		_eventManager = eventManager;
		_useOrigin = useOrigin;
	}
	
	public IvySettings getSettings() {
		return _settings;
	}
	public boolean isUseOrigin() {
		return _useOrigin;
	}

	public CacheManager getCacheManager() {
		return _cacheManager;
	}

	public EventManager getEventManager() {
		return _eventManager;
	}
	
}