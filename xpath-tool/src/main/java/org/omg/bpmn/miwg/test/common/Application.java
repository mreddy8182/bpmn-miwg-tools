/**
 * The MIT License (MIT)
 * Copyright (c) 2013 OMG BPMN Model Interchange Working Group
 *
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 */

package org.omg.bpmn.miwg.test.common;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Application {

	private static Pattern twopart = Pattern.compile("(.*)\\s(\\S+)"); 
	
	public String application;
	public File folder;
	public String name;
	public String version;
	
	public Application(File folder) {
		this.folder = folder;
		this.application = folder.getName();
		
		Matcher m = twopart.matcher(application);
		
		if (m.matches()) {
			this.name = m.group(1);
			this.version = m.group(2);
		} else {
			this.name = application;
			this.version = "";
		}
		
		
	}

	

	public String toString() {
		return name + "//" + version;
	}


}
