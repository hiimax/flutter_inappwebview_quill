package com.garv.flutter_inappwebview_quill.types;

import java.util.HashMap;

import io.flutter.plugin.platform.PlatformView;

public interface PlatformWebView extends PlatformView {
  void makeInitialLoad(HashMap<String, Object> params);
}
