package org.geogit.storage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public interface BlobPrinter {
	
	/**
	 * Prints the contents of the provided byte array to the PrintStream in an
	 * xml-based format.
	 * 
	 * @param rawBlob
	 * @param out
	 * @throws IOException
	 */
	public void print(final byte[] rawBlob, final PrintStream out) throws IOException;
	
    /**
     * Prints the contents of the provided InputStream to the PrintStream in an
     * xml-based format.
     * 
     * @param rawBlob
     * @param out
     * @throws IOException
     */
    public void print(final InputStream rawBlob, final PrintStream out) throws IOException;

}
