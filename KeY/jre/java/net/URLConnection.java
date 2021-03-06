/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.net;

public abstract class URLConnection extends java.lang.Object
{
   protected java.net.URL url;
   protected boolean doInput;
   protected boolean doOutput;
   protected boolean allowUserInteraction;
   protected boolean useCaches;
   protected long ifModifiedSince;
   protected boolean connected;
   static java.net.ContentHandlerFactory factory;


   /*@ requires true; ensures true; assignable \everything; */
   public static java.net.FileNameMap getFileNameMap();

   /*@ requires true; ensures true; assignable \everything; */
   public static void setFileNameMap(java.net.FileNameMap arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public abstract void connect() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public void setConnectTimeout(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int getConnectTimeout();

   /*@ requires true; ensures true; assignable \everything; */
   public void setReadTimeout(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public int getReadTimeout();

   /*@ requires true; ensures true; assignable \everything; */
   protected URLConnection(java.net.URL arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.net.URL getURL();

   /*@ requires true; ensures true; assignable \everything; */
   public int getContentLength();

   /*@ requires true; ensures true; assignable \everything; */
   public long getContentLengthLong();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getContentType();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getContentEncoding();

   /*@ requires true; ensures true; assignable \everything; */
   public long getExpiration();

   /*@ requires true; ensures true; assignable \everything; */
   public long getDate();

   /*@ requires true; ensures true; assignable \everything; */
   public long getLastModified();

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getHeaderField(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.util.Map getHeaderFields();

   /*@ requires true; ensures true; assignable \everything; */
   public int getHeaderFieldInt(java.lang.String arg0, int arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public long getHeaderFieldLong(java.lang.String arg0, long arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public long getHeaderFieldDate(java.lang.String arg0, long arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getHeaderFieldKey(int arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getHeaderField(int arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.lang.Object getContent() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.lang.Object getContent(java.lang.Class[] arg0) throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.security.Permission getPermission() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.io.InputStream getInputStream() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public java.io.OutputStream getOutputStream() throws java.io.IOException;

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String toString();

   /*@ requires true; ensures true; assignable \everything; */
   public void setDoInput(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean getDoInput();

   /*@ requires true; ensures true; assignable \everything; */
   public void setDoOutput(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean getDoOutput();

   /*@ requires true; ensures true; assignable \everything; */
   public void setAllowUserInteraction(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean getAllowUserInteraction();

   /*@ requires true; ensures true; assignable \everything; */
   public static void setDefaultAllowUserInteraction(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static boolean getDefaultAllowUserInteraction();

   /*@ requires true; ensures true; assignable \everything; */
   public void setUseCaches(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public boolean getUseCaches();

   /*@ requires true; ensures true; assignable \everything; */
   public void setIfModifiedSince(long arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public long getIfModifiedSince();

   /*@ requires true; ensures true; assignable \everything; */
   public boolean getDefaultUseCaches();

   /*@ requires true; ensures true; assignable \everything; */
   public void setDefaultUseCaches(boolean arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public void setRequestProperty(java.lang.String arg0, java.lang.String arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public void addRequestProperty(java.lang.String arg0, java.lang.String arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public java.lang.String getRequestProperty(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public java.util.Map getRequestProperties();

   /*@ requires true; ensures true; assignable \everything; */
   public static void setDefaultRequestProperty(java.lang.String arg0, java.lang.String arg1);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String getDefaultRequestProperty(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static void setContentHandlerFactory(java.net.ContentHandlerFactory arg0);

   /*@ requires true; ensures true; assignable \everything; */
   public static java.lang.String guessContentTypeFromName(java.lang.String arg0);

   /*@ requires true; ensures true; assignable \everything; signals (java.io.IOException e) true; */
   public static java.lang.String guessContentTypeFromStream(java.io.InputStream arg0) throws java.io.IOException;
}
