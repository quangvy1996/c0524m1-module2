package ss13.bai_tap.chuoi_lien_tiep_co_do_dai_lon_nhat;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Character> list = new LinkedList<>();
        LinkedList<Character> max = new LinkedList<>();

        System.out.println("Nhập chuỗi");
        String input = sc.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (list.size() > 1 && input.charAt(i) <= list.getLast() && list.contains(input.charAt(i))) {
                list.clear();
            }
            list.add(input.charAt(i));
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
        }
        for (Character chara: max) {
            System.out.print(chara);
        }

    }
}
