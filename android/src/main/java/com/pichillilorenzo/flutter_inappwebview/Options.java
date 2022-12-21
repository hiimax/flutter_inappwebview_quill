package com.garv.flutter_inappwebview_quill;

import java.util.Map;

public interface Options<T> {
  public Options parse(Map<String, Object> options);
  public Map<String, Object> toMap();
  public Map<String, Object> getRealOptions(T obj);
}
