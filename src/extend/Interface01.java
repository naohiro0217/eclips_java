package extend;

import extend.phone.Camera;
import extend.phone.MobilePhone;

public class Interface01 {
	public static void main(String[] args) {
		extend.phone.MobilePhone mobilePhone = new MobilePhone("000-111-2222");

		System.out.println("電話番号は最大" + MobilePhone.MAX_NUMBER_DIGITS + "桁です。");
		mobilePhone.call("99-8888-7777");
		Interface01.classTakePicture(mobilePhone);
	}

	public static void classTakePicture(Camera camera) {
		camera.takePicture();
	}

}
