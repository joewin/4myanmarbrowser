package com.apps4mm.browserformm;

import java.io.File;
import java.io.FileNotFoundException;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public class Myprovider extends ContentProvider {

	private static final String URI_PREFIX = "content://com.apps4mm.browserformm.myfile";

	  public static String constructUri(String strUri)
	  {
	    if (Uri.parse(strUri).isAbsolute());
	    while (true)
	    {
	    	strUri= "content://com.apps4mm.browserformm.myfile" + strUri;
	      return strUri;
	      
	    }
	  }

	  @Override
	  public int delete(Uri myUri, String str, String[]strArray)
	  {
	    return 0;
	  }
	  @Override
	  public String getType(Uri myUri)
	  {
	    return null;
	  }
	  @Override
	  public Uri insert(Uri myUri, ContentValues contv)
	  {
	    return null;
	  }
	  @Override
	  public boolean onCreate()
	  {
	    return false;
	  }
	  @Override
	  public ParcelFileDescriptor openFile(Uri myUri, String str)
	    throws FileNotFoundException
	  {
	    return ParcelFileDescriptor.open(new File(myUri.getPath()),ParcelFileDescriptor.MODE_READ_ONLY );
	  }
	  @Override
	  public Cursor query(Uri myUri, String[] strArray, String paramString1, String[]strArray2, String paramString2)
	  {
	    return null;
	  }

	  public int update(Uri myUri, ContentValues contv, String paramString, String[]strArray)
	  {
	    return 0;
	  }

}
