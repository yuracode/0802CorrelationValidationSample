package com.example.demo.form;

import lombok.Data;

@Data
public class SampleForm {
	/** パスワード */
	private String password;
	/** 確認用パスワード */
	private String confirmPassword;

	// パスワードと確認用パスワードが一致するかチェック
//	@AssertTrue(message = "パスワードが一致しません")
//	public boolean isSamePassword() {
//		return Objects.equals(password, confirmPassword);
//	}
}