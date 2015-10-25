package com.ait.toolkit.sap.ui.client.ui.commons;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Button extends JsObject {

    public Button() {
        jsObj = createPeer();
    }

    public native void setText( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setText(value);
    }-*/;

    public native void placeAt( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.placeAt(value);
    }-*/;

    public native void addPressHandler( Function handler )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.attachEvent('press', function(e) {
			handler.@com.ait.toolkit.core.client.Function::execute()();
		});
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.sap.ui.commons.Button();
    }-*/;

}
