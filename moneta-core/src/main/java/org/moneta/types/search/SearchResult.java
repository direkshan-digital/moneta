/*
 * This software is licensed under the Apache License, Version 2.0
 * (the "License") agreement; you may not use this file except in compliance with
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
package org.moneta.types.search;

import org.moneta.types.BaseType;
import org.moneta.types.Record;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the results of a topic search;
 * @author D. Ashmore
 *
 */
public class SearchResult extends BaseType {
	
	private Integer errorCode;
	private String errorMessage;

	@JsonProperty("records")
	private Record[] resultData;
	
	public Integer getErrorCode() {
		return errorCode;
	}
	
	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
	public Record[] getResultData() {
		return resultData;
	}

	public void setResultData(Record[] resultData) {
		this.resultData = resultData;
	}

}
