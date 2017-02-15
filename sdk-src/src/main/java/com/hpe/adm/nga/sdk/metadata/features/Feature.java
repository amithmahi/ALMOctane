/*
 *
 *    Copyright 2017 Hewlett-Packard Development Company, L.P.
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.hpe.adm.nga.sdk.metadata.features;

/**
 *
 * This class hold the base class of all Features
 *
 */
public class Feature {
	
	private String name ="";
	
	/**
	 * get feature name
	 * @return The name of the feature
	 */
	public String getName(){
		return name;
		}
	
	/**
	 * set feature name
	 * @param newName The name of the feature
	 */
	public void setName(String newName){
		name = newName; 
		}
	
}

