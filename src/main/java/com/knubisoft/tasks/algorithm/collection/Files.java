package com.knubisoft.tasks.algorithm.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;
import java.util.List;

/**
 * TODO implement class and tests
 */
public interface Files {

    /**
     * Tests whether the contents of two files are equal.
     * <p>
     * This method checks to see if the two files are different lengths or if they point to the same file, before
     * resorting to byte-by-byte comparison of the contents.
     * </p>
     * <p>
     * </p>
     *
     * @param file1 the first file
     * @param file2 the second file
     * @return true if the content of the files are equal or they both don't exist, false otherwise
     * @throws IllegalArgumentException when an input is not a file.
     * @throws IOException If an I/O error occurs.
     * @see org.apache.commons.io.file.PathUtils#fileContentEquals(Path,Path,java.nio.file.LinkOption[],java.nio.file.OpenOption...)
     */
    boolean contentEquals(final File file1, final File file2) throws IOException;

    /**
     * Copies a directory to within another directory preserving the file dates.
     * <p>
     * This method copies the source directory and all its contents to a directory of the same name in the specified
     * destination directory.
     * </p>
     * <p>
     * The destination directory is created if it does not exist. If the destination directory did exist, then this
     * method merges the source with the destination, with the source taking precedence.
     * </p>
     * <p>
     * <strong>Note:</strong> This method tries to preserve the files' last modified date/times using
     * {@link File#setLastModified(long)}, however it is not guaranteed that those operations will succeed. If the
     * modification operation fails, the methods throws IOException.
     * </p>
     *
     * @param sourceDir an existing directory to copy, must not be {@code null}.
     * @param destinationDir the directory to place the copy in, must not be {@code null}.
     * @throws NullPointerException if any of the given {@code File}s are {@code null}.
     * @throws IllegalArgumentException if the source or destination is invalid.
     * @throws FileNotFoundException if the source does not exist.
     * @throws IOException if an error occurs or setting the last-modified time didn't succeeded.
     */
    void copyDirectoryToDirectory(final File sourceDir, final File destinationDir) throws IOException;


    /**
     * Gets the contents at the given URL.
     *
     * @param url The URL source.
     * @param encoding The encoding name for the URL contents.
     * @return The contents of the URL as a String.
     * @throws IOException if an I/O exception occurs.
     */
    String toString(final URL url, final Charset encoding) throws IOException;

    /**
     * Gets the contents of an {@code InputStream} as a String
     * using the specified character encoding.
     * <p>
     * This method buffers the input internally, so there is no need to use a
     * {@code BufferedInputStream}.
     * </p>
     *
     * @param input the {@code InputStream} to read from
     * @param charset the charset to use, null means platform default
     * @return the requested String
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O error occurs
     * @since 2.3
     */
    String toString(final InputStream input, final Charset charset) throws IOException;


    /**
     * Gets the contents of a {@code URL} as a {@code byte[]}.
     *
     * @param url the {@code URL} to read
     * @return the requested byte array
     * @throws NullPointerException if the input is null
     * @throws IOException          if an I/O exception occurs
     * @since 2.4
     */
    byte[] toByteArray(final URL url) throws IOException;



    /**
     * Normalizes a path, removing double and single dot path steps.
     * <p>
     * This method normalizes a path to a standard format.
     * The input may contain separators in either Unix or Windows format.
     * The output will contain separators in the format of the system.
     * <p>
     * A trailing slash will be retained.
     * A double slash will be merged to a single slash (but UNC names are handled).
     * A single dot path segment will be removed.
     * A double dot will cause that path segment and the one before to be removed.
     * If the double dot has no parent path segment to work with, {@code null}
     * is returned.
     * <p>
     * The output will be the same on both Unix and Windows except
     * for the separator character.
     * <pre>
     * /foo//               --&gt;   /foo/
     * /foo/./              --&gt;   /foo/
     * /foo/../bar          --&gt;   /bar
     * /foo/../bar/         --&gt;   /bar/
     * /foo/../bar/../baz   --&gt;   /baz
     * //foo//./bar         --&gt;   /foo/bar
     * /../                 --&gt;   null
     * ../foo               --&gt;   null
     * foo/bar/..           --&gt;   foo/
     * foo/../../bar        --&gt;   null
     * foo/../bar           --&gt;   bar
     * //server/foo/../bar  --&gt;   //server/bar
     * //server/../bar      --&gt;   null
     * C:\foo\..\bar        --&gt;   C:\bar
     * C:\..\bar            --&gt;   null
     * ~/foo/../bar/        --&gt;   ~/bar/
     * ~/../bar             --&gt;   null
     * </pre>
     * (Note the file separator returned will be correct for Windows/Unix)
     *
     * @param fileName  the fileName to normalize, null returns null
     * @return the normalized fileName, or null if invalid. Null bytes inside string will be removed
     */
    String normalize(final String fileName);


    /**
     * Reads the contents of a file line by line to a List of Strings.
     * The file is always closed.
     *
     * @param file     the file to read, must not be {@code null}
     * @param charset the charset to use, {@code null} means platform default
     * @return the list of Strings representing each line in the file, never {@code null}
     * @throws NullPointerException if file is {@code null}.
     * @throws FileNotFoundException if the file does not exist, is a directory rather than a regular file, or for some
     *         other reason cannot be opened for reading.
     * @throws IOException if an I/O error occurs.
     */
    List<String> readLines(final File file, final Charset charset) throws IOException;


    /**
     * Tests whether the directory is empty.
     *
     * @param directory the directory to query.
     * @return whether the directory is empty.
     * @throws IOException if an I/O error occurs.
     * @throws NotDirectoryException if the file could not otherwise be opened because it is not a directory
     *                               <i>(optional specific exception)</i>.
     */
    boolean isEmptyDirectory(final File directory);
}
