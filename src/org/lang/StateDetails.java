package org.lang;

public class StateDetails {
private void southIndia() {
	System.out.println("South india is in southern part of india");
}
private void northIndia() {
	System.out.println("North india is in northern part of india");
}
public static void main(String[] args) {
	StateDetails sd=new StateDetails();
	sd.southIndia();
	sd.northIndia();
	LanguageInfo li=new LanguageInfo();
	li.tamilLanguage();
	li.englishLanguage();
	li.hindiLanguage();
	}
}
