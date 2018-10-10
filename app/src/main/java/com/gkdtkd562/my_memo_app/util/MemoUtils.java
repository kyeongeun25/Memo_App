package com.gkdtkd562.my_memo_app.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoUtils {

    public static String getCurrentDate(){
        // 현재 날짜 구하기
        // level 26(Nogut)이상에서는 LocalDateTime이라는 클래스를 사용 할 수 있다.
        // 현재 level 23(Mash)에서는 사용불가

        // 1. 현재 시스템의 시간(UNIX TIME)을 가져온다.
        // System.currentTimeMillis()
        long now = System.currentTimeMillis();

        // 2. Date 객체 생성
        Date date = new Date(now);

        // 3. 날짜형 문자열로 변환
        // 가. 날짜의 문자열 포멧을 설정
        SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
        String getDate = sDate.format(date);

        // 나. 시간의 문자열 포맷을 설정
        SimpleDateFormat sTime = new SimpleDateFormat("HH:mm:ss");
        String getTime = sTime.format(date);

        return getDate + " " + getTime ;

    }

}
