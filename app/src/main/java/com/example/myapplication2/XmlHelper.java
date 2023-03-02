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
    public XmlHelper() {
        ES = new ArrayList<>();
        xmlPullParser = Xml.newPullParser();
    }

    //         String [] tags  = {"feed-0","entry-1","title-2","category-3","author-2","link-2","updated-2","summary-2"};
    public List<T> parser(InputStream in, String []matchTag) {
        try {
            if (depth == 0){
                prepare(in);
            }


        } catch (Exception e) {
            Log.d("parser errors: ",e.getMessage());
        }

        return parser(in,matchTag);
    }



    public void prepare(InputStream in) throws XmlPullParserException, IOException {
// check null
        gI();
        xmlPullParser.setFeature(null,false);
        xmlPullParser.setInput(in,null);
        xmlPullParser.nextTag();
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
