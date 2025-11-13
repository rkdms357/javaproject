package com.shinhan.day15;

import java.io.*;
import java.net.*;
import java.util.*;

import org.json.*;

public class JSONTest {
    public static void main(String[] args) throws IOException {
        // 빗썸에서 data가져오기
        String strUrl = "https://api.bithumb.com/v1/market/all";
        URL url = new URL(strUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");// 대소문자구분
        conn.setRequestProperty("Accept", "application/json");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String data;
        StringBuffer sb = new StringBuffer();
        while ((data = br.readLine()) != null) {
            sb.append(data);
        }
        String result = sb.toString(); // '[{"":"", "":""}, .., {"":"", "":""}]'
        JSONArray jsonArray = new JSONArray(result);
        System.out.println(jsonArray);
        List<String> marketList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = (JSONObject) jsonArray.get(i);
            marketList.add((String) obj.get("market")); // 종목이름
        }
        System.out.println(marketList);
        lab(marketList);
    }

    // 모든종목의 시작가를 가져와서 출력
    private static void lab(List<String> marketList) throws IOException {
        marketList.stream().forEach(market -> {
            int price = call(market);
            System.out.println(market + "의 시작가는" + price);
        });
    }

    private static int call(String market) {
        Integer opening_price = 0;
        String strUrl = "https://api.bithumb.com/v1/ticker?markets=KRW-BTC";
        URL url;
        try {
            url = new URL(strUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");// 대소문자구분
            conn.setRequestProperty("Accept", "application/json");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String data;
            StringBuffer sb = new StringBuffer();
            while ((data = br.readLine()) != null) {
                sb.append(data);
            }
            String result = sb.toString();
            //JsonArray : [{"market":"KRW-BTC","opening_price":"1234566"}]
            //JSONObject : {"market":"KRW-BTC","opening_price":"1234566"}
            JSONArray jsonArray = new JSONArray(result);
            JSONObject obj = (JSONObject) jsonArray.get(0);
            opening_price = (Integer) obj.get("opening_price");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return opening_price;
    }

    public static void main2() {
        JSONObject jsonObj = new JSONObject();
        JSONObject jsonObj2 = new JSONObject();
        jsonObj.put("홍1", 100); // {"홍1" : 100}
        jsonObj.put("홍2", "개발자"); // {"홍2" : "개발자"}
        System.out.println(jsonObj);
        System.out.println(jsonObj2);
        // 배열
        JSONArray jsonArrays = new JSONArray();
        jsonArrays.put(jsonObj);
        jsonArrays.put(jsonObj2);
        System.out.println(jsonArrays);
    }
}