package com.app.iNBA;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import android.os.AsyncTask;
import android.util.Log;


/*public class HtmlParser {
	
	private final static String TAG = "iNBA";
	
	public static void Parsing() throws Exception {
	String url = "http://nbafilm.enjoy101.org/top10/";
		
	//Document doc = Jsoup.connect(url).get();

	//Element link = doc.select("a").first();
	//String relHref = link.attr("href"); // == "/"
	//String absHref = link.attr("abs:href"); // "http://jsoup.org/"
	
	//Log.v(TAG, relHref);
	//Log.v(TAG, absHref);
	Log.v(TAG, "123");
	}

}*/

public class HtmlParser extends AsyncTask<Void,Void, Void>
{
	   //HERE DECLARE THE VARIABLES YOU USE FOR PARSING
	   private Element overview=null;
	   private  Element featureList=null;
	   private Elements features=null;
	   private Element paragraph =null;
	   String url = "http://nbafilm.enjoy101.org/top10/";
	    @Override
	    protected Void doInBackground(Void... arg0) 
	    { 
	        Document doc = null;
	        try {
	        Log.v("iNBA", "123");
			doc = Jsoup.connect(url).get();
			//overview = doc.select("a[href]").last();
	        //featureList = doc.select("a[href]").last();

	       //features = featureList.select("li");
	       //paragraph = overview.select("p").last();

	        //Element link = doc.select("a").first();
			String absHref;
			Elements links = doc.select("li").select("a");
			
			for(Element link: links)
			{
				absHref = link.attr("abs:href");
				Log.v("iNBA", absHref);
			}
			//Element link = doc.select("a").get(0);
	       
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }

	        // Get the paragraph element
	       // article.setText(paragraph.text()); I comment this out because you cannot update ui from non-ui thread, since doInBackground is running on background thread.

	        return null;
	    }
	     @Override
	     protected void onPostExecute(Void result)
	     {

	    //TextView article = (TextView)findViewById(R.id.releaseInfo);
	     //   final TextView featuresText = (TextView)findViewById(R.id.features);

		} 

	}