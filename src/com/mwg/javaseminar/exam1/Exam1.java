package com.mwg.javaseminar.exam1;

import java.util.Calendar;
import java.util.Scanner;

public class Exam1 {

  public static void main(String[] args) {
    String yourName = System.getProperty("yourName");
    if (!validateName(yourName) && args.length > 0) {
      yourName = args[0];
    }
    if (!validateName(yourName)) {
      System.out.print("Vui lòng cho biết tên : ");
      try (Scanner scanner = new Scanner(System.in)) {
        yourName = scanner.nextLine();
      }
    }
    if (validateName(yourName)) {
      System.out.println(String.format("%s bạn %s.", getHelloMsg(), yourName.toUpperCase()));
    } else {
      System.out.println("Xin lỗi tôi không biết bạn là ai !");
    }
  }

  private static boolean validateName(String name) {
    return name != null && !name.trim().isEmpty();
  }

  private static String getHelloMsg() {
    int hourOfDay = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    if (hourOfDay < 12) {
      return "Chào buổi sáng";
    } else if (hourOfDay < 18) {
      return "Chào buổi chiều";
    } else {
      return "Chào buổi tối";
    }
  }
}
