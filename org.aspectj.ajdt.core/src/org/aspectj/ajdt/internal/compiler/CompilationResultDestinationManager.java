/* *******************************************************************
 * Copyright (c) 2006 Contributors.
 * All rights reserved. 
 * This program and the accompanying materials are made available 
 * under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution and is available at 
 * http://eclipse.org/legal/epl-v10.html 
 *  
 * Contributors: 
 *   Adrian Colyer			Initial implementation
 * ******************************************************************/
package org.aspectj.ajdt.internal.compiler;

import java.io.File;

/**
 * acts as a bridge from ajde's OutputLocationManager interface to the compiler internals
 * @author adrian
 *
 */
public interface CompilationResultDestinationManager {

	/**
	 * Return the directory root under which the results of compiling the given
	 * source file. For example, if the source file contains the type a.b.C, and
	 * this method returns "target/classes" the resulting class file will be written
	 * to "target/classes/a/b/C.class"
	 * 
	 * @param compilationUnitName  the fully-qualified name of the compilation unit that has been
	 *  compiled
	 * @return a File object representing the root directory under which compilation results for this
	 *  unit should be written
	 */
	File getOutputLocationForClass(String compilationUnitName);
	
	/**
	 * When copying resources from source folders to output location, return the
	 * root directory under which the resource should be copied.
	 * 
	 * @param resourceName the fully-qualified name of the resource to be copied
	 * @return a File object representing the root directory under which this resource
	 * should be copied
	 */
	File getOutputLocationForResource(String resourceName);
	
}