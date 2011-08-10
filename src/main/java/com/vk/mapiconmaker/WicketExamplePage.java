/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vk.mapiconmaker;

import com.vk.mapiconmaker.WicketExampleHeader;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.util.string.Strings;

/**
 * Base class for all example pages.
 * 
 * @author Jonathan Locke
 */
public class WicketExamplePage extends WebPage
{
	/**
	 * Constructor
	 */
	public WicketExamplePage()
	{
		final String packageName = getClass().getPackage().getName();
		add(new WicketExampleHeader("mainNavigation", Strings.afterLast(packageName, '.'), this));
		explain();
	}

	/**
	 * Override base method to provide an explanation
	 */
	protected void explain()
	{
	}
}