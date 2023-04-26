package com.java.main;

import com.java.view.AppUI;

import static com.java.view.AppUI.inputInteger; // 임포트 해줌으로써 클래스 AppUI 안써줘도됨.

public class Main {

	public static void main(String[] args) {
		
		AppController controller = new AppController();
		
		while(true) {
			AppUI.startScreen();
			int selectNumber = inputInteger();
			controller.chooseSystem(selectNumber);
		}

	}

}
