/*
 * DISCLAIMER
 *
 * Copyright 2017 ArangoDB GmbH, Cologne, Germany
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
 *
 * Copyright holder is ArangoDB GmbH, Cologne, Germany
 */

package com.arangodb.spring.demo.entity;

import java.util.Arrays;

import org.springframework.data.annotation.Id;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.GeoIndexed;

/**
 * @author Mark Vollmary
 *
 */
@Document("locations")
public class Location {

	@Id
	private String id;
	private final String name;
	@GeoIndexed
	private final double[] location;

	public Location(final String name, final double[] location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public double[] getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + ", location=" + Arrays.toString(location) + "]";
	}

}
