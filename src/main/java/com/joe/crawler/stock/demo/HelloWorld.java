package com.joe.crawler.stock.demo;

import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Controller
public class HelloWorld {


    public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null) {
            if (l1.val + l2.val < 10) {
                return new ListNode(l1.val + l2.val);
            }
            ListNode listNode = new ListNode(1);
            listNode.next = new ListNode(l1.val + l2.val - 10);
            return listNode;
        }

        if (l1.next == null && l2.next != null) {
            return addTwoNumbers(l1, l2.next);
        }
        if (l1.next != null && l2.next == null) {
            return addTwoNumbers(l1.next, l2);
        }

        return addTwoNumbers(l1.next, l2.next);
    }

    public static void main(String[] args) {
//        addTwoNumbers(new ListNode(1), new ListNode(2));

    }
}

class ListNode {
    int val;
    ListNode next;
    boolean isLastNode = false;

    ListNode(int x) {
        val = x;
    }

    public static void main(String[] args) {
        char a = 9;
        int b = 's';
        System.out.println(10/-2);
        String aaa= "111";
        aaa.concat("aaaa");
//        System.out.println(new ArrayList<Integer>(null));
        LocalDateTime dt = LocalDateTime.of(2014,7,31,1,1);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}