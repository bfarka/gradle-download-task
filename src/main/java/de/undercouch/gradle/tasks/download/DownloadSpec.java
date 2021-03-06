// Copyright 2013 Michel Kraemer
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package de.undercouch.gradle.tasks.download;

import java.io.File;
import java.net.MalformedURLException;
import java.util.Map;

/**
 * An interface for classes that perform file downloads
 * @author Michel Kraemer
 */
public interface DownloadSpec {
    /**
     * Sets the download source URL
     * @param src the URL
     * @throws MalformedURLException if the download source is not a URL
     */
    void src(Object src) throws MalformedURLException;
    
    /**
     * Sets the download destination
     * @param dest a file or directory where to store the retrieved file
     */
    void dest(Object dest);
    
    /**
     * Sets the quiet flag
     * @param quiet true if download progress should not be logged
     */
    void quiet(boolean quiet);
    
    /**
     * Sets the overwrite flag
     * @param overwrite true if existing files should be overwritten, false otherwise
     */
    void overwrite(boolean overwrite);
    
    /**
     * Sets the onlyIfNewer flag
     * @param onlyIfNewer true if the file should only be downloaded if it
     * has been modified on the server since the last download
     */
    void onlyIfNewer(boolean onlyIfNewer);
    
    /**
     * Specifies if compression should be used during download
     * @param compress true if compression should be enabled
     */
    void compress(boolean compress);
    
    /**
     * Sets the username for <code>Basic</code> authentication
     * @param username the username
     */
    void username(String username);
    
    /**
     * Sets the password for <code>Basic</code> authentication
     * @param password the password
     */
    void password(String password);

    /**
     * Sets the HTTP request headers to us when downloading
     * @param headers a Map of header names to values
     */
    void headers(Map<String, String> headers);

    /**
     * Sets an HTTP request header to use when downloading
     * @param name name of the HTTP header
     * @param value value of the HTTP header
     */
    void header(String name, String value);

    /**
     * @return the download source(s), either a URL or a list of URLs
     */
    Object getSrc();
    
    /**
     * @return the download destination
     */
    Object getDest();
    
    /**
     * @return the quiet flag
     */
    boolean isQuiet();
    
    /**
     * @return the overwrite flag
     */
    boolean isOverwrite();
    
    /**
     * @return the onlyIfNewer flag
     */
    boolean isOnlyIfNewer();
    
    /**
     * @return true if compression is enabled
     */
    boolean isCompress();
    
    /**
     * @return the username for <code>Basic</code> authentication
     */
    String getUsername();
    
    /**
     * @return the password for <code>Basic</code> authentication
     */
    String getPassword();

    /**
     * @return the HTTP request headers to use when downloading
     */
    Map<String, String> getHeaders();

    /**
     * @param name name of the HTTP header
     * @return the value of the HTTP header
     */
    String getHeader(String name);
}
