package com.garv.flutter_inappwebview_quill;

import android.content.Context;

import com.garv.flutter_inappwebview_quill.in_app_webview.FlutterWebView;
import com.garv.flutter_inappwebview_quill.types.PlatformWebView;
import com.garv.flutter_inappwebview_quill.types.WebViewImplementation;

import java.util.HashMap;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class FlutterWebViewFactory extends PlatformViewFactory {
  private final InAppWebViewFlutterPlugin plugin;

  public FlutterWebViewFactory(final InAppWebViewFlutterPlugin plugin) {
    super(StandardMessageCodec.INSTANCE);
    this.plugin = plugin;
  }

  @Override
  public PlatformView create(Context context, int id, Object args) {
    HashMap<String, Object> params = (HashMap<String, Object>) args;

    PlatformWebView flutterWebView;
    WebViewImplementation implementation = WebViewImplementation.fromValue((Integer) params.get("implementation"));
    switch (implementation) {
      case NATIVE:
      default:
        flutterWebView = new FlutterWebView(plugin, context, id, params);
    }
    flutterWebView.makeInitialLoad(params);

    return flutterWebView;
  }
}

