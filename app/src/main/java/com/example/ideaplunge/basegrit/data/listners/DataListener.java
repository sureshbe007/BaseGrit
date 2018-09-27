package com.example.ideaplunge.basegrit.data.listners;

public interface DataListener {

  void onResponse(String data);

  void onError(String error);
}
