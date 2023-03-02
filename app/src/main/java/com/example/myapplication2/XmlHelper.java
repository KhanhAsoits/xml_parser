package com.example.myapplication2;

import android.util.Log;
import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class XmlHelper<T> {
    List<T> ES;
    XmlPullParser xmlPullParser;

    int depth = 0;
    boolean isStart = false;
    public XmlHelper() {
        ES = new ArrayList<>();
        xmlPullParser = Xml.newPullParser();
    }


    //         String [] tags  = {"feed-0","entry-1","title-2","category-3","author-2","link-2","updated-2","summary-2"};
    public List parser(InputStream in, String []matchTag) {
        try {
            while (xmlPullParser.nextTag() != XmlPullParser.END_TAG){

                xmlPullParser.getEventType()

            }
        } catch (Exception e) {
            Log.d("parser errors: ",e.getMessage());
        }
    }



    public void prepare(InputStream in,String startTag) throws XmlPullParserException, IOException {
// check null
        gI();
        xmlPullParser.setFeature(null,false);
        xmlPullParser.setInput(in,null);
        xmlPullParser.nextTag();
        xmlPullParser.require(XmlPullParser.START_TAG,null,startTag);
    }

    public void gI() {
        if (xmlPullParser == null) {
            xmlPullParser = Xml.newPullParser();
        }
    }

    public void resetParser() {
        xmlPullParser = Xml.newPullParser();
    }

    public void resetData() {
        ES = new ArrayList<>();
    }
}
