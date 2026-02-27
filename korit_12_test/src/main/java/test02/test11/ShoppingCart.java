package test02.test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: cart에 "사과", "우유", "빵"을 추가하시오.
        List<String> cart = new ArrayList<>();
        cart.add("사과");
        cart.add("우유");
        cart.add("빵");

        // TODO: cart에서 "우유"를 삭제하시오.
        cart.remove(1);

        // TODO: cart의 첫 번째 항목을 조회하여 "첫 번째 상품: [상품명]" 형식으로 출력하시오.
        String firstProduct = cart.get(1);
        System.out.println("첫 번째 상품: [ " + firstProduct + " ]");

        // TODO: 최종 장바구니 목록을 "최종 목록: [리스트]" 형식으로 출력하시오.
        System.out.printf("최종 상품 : " + cart);
    }
}
