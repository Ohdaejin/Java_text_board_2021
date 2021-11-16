package com.odj.exam.Board;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String a;
    a = sc.nextLine();

    System.out.println("==게시판 v 0.1==");
    System.out.println("==프로그램 시작==");
    System.out.println("명령) " + a);
    System.out.println("입력된 명령어 : " +a );
    System.out.println("==프로그램 종료=");
  }
}
