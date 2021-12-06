package org.lang;

public class LanguageInfo {
public void tamilLanguage() {
System.out.println("Tamil is mostly used language by tamilnadu");
}
public void englishLanguage() {
	System.out.println("Eng is the international speaking language");
}
public void hindiLanguage() {
	System.out.println("Hindi language is mostly used by indian people");
}
public static void main(String[] args) {
	LanguageInfo li=new LanguageInfo();
	li.tamilLanguage();
	li.englishLanguage();
	li.hindiLanguage();
}
}
