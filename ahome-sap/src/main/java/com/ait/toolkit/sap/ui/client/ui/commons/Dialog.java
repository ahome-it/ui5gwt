package com.ait.toolkit.sap.ui.client.ui.commons;

import com.ait.toolkit.core.client.JsObject;
import com.google.gwt.core.client.JavaScriptObject;

public class Dialog extends JsObject {

    public Dialog() {
        jsObj = createPeer();
    }

    public native void setTitle( String value )/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setTitle(value);
    }-*/;

    public native void open()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.open();
    }-*/;

    private native JavaScriptObject createPeer()/*-{
		return new $wnd.sap.ui.commons.Dialog();
    }-*/;

}
