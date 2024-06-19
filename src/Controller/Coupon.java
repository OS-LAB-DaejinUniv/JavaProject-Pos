package Controller;

import java.io.*;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Coupon {
    private static final String COUPON_FILE = "./src/coupons.csv";
    private static final int COUPON_LENGTH = 8;

    // 쿠폰 번호 생성
    public static String generateCoupon() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(COUPON_LENGTH);
        for (int i = 0; i < COUPON_LENGTH; i++) {
            int c = random.nextInt(36);
            if (c < 10) {
                sb.append(c); // 숫자 0-9
            } else {
                sb.append((char) ('A' + c - 10)); // 알파벳 A-Z
            }
        }
        return sb.toString();
    }

    // 쿠폰 번호 저장
    public static void saveCoupon(String coupon) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(COUPON_FILE, true));
        writer.write(coupon);
        writer.newLine();
        writer.close();
    }

    // 쿠폰 번호 읽기
    public static Set<String> loadCoupons() throws IOException {
        Set<String> coupons = new HashSet<>();
        BufferedReader reader = new BufferedReader(new FileReader(COUPON_FILE));
        String line;
        while ((line = reader.readLine()) != null) {
            coupons.add(line.trim());
        }
        reader.close();
        return coupons;
    }

    // 쿠폰 번호 사용하면 삭제
    public static void deleteCoupon(String coupon) throws IOException {
        Set<String> coupons = loadCoupons();
        if (coupons.remove(coupon)) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(COUPON_FILE));
            for (String c : coupons) {
                writer.write(c);
                writer.newLine();
            }
            writer.close();
        }
    }
}
